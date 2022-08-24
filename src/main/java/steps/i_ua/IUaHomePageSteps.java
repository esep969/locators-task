package steps.i_ua;

import org.openqa.selenium.WebDriver;
import pages.i_ua.IUaHomePage;

public class IUaHomePageSteps {

    private IUaHomePage iUaHomePage;

    public IUaHomePageSteps(WebDriver driver) {
        iUaHomePage = new IUaHomePage(driver);
    }

    public void loginToAccount(String login, String password){
        iUaHomePage.getLoginInput().sendKeys(login);
        iUaHomePage.getPasswordInput().sendKeys(password);
        iUaHomePage.getSubmitButton().click();
    }

    public void openHomePage(String url) {
        iUaHomePage.openPage(url);
    }
}
