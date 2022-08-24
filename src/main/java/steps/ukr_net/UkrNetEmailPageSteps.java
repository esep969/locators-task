package steps.ukr_net;

import org.openqa.selenium.WebDriver;
import pages.ukr_net.UkrNetEmailPage;

import static pages.BasePage.DEFAULT_TIMEOUT;

public class UkrNetEmailPageSteps {

    private UkrNetEmailPage emailPage;

    public UkrNetEmailPageSteps(WebDriver driver) {
        emailPage = new UkrNetEmailPage(driver);
    }

    public String getSubject() {
        return emailPage.getSubject().getText();
    }

    public String getFromEmail() {
        return emailPage.getEmail().getText();
    }

    public String getEmailText() {
        return emailPage.getText().getText();
    }

    public boolean deleteEmail() {
        emailPage.getDeleteEmailButton().click();
        emailPage.waitForElementBeVisible(DEFAULT_TIMEOUT, emailPage.getDeleteConfirmationMessage());
        return emailPage.getDeleteConfirmationMessage().isDisplayed();
    }
}
