package steps.ukr_net;

import org.openqa.selenium.WebDriver;
import pages.ukr_net.UkrNetHomePage;

public class UkrNetHomePageSteps {

    private UkrNetHomePage homePage;

    public UkrNetHomePageSteps(WebDriver driver) {
        homePage = new UkrNetHomePage(driver);
    }

    public void openPage(String url) {
        homePage.openPage(url);
    }

    public void loginToAccount(String login, String password) {
        homePage.getLoginInput().sendKeys(login);
        homePage.getPasswordInput().sendKeys(password);
        homePage.getSubmitButton().click();
    }
}
