package steps.i_ua;

import org.openqa.selenium.WebDriver;
import pages.i_ua.IUaInboxPage;

import static pages.BasePage.DEFAULT_TIMEOUT;

public class IUaInboxPageSteps {

    private IUaInboxPage uaInboxPage;

    public IUaInboxPageSteps(WebDriver driver) {
        uaInboxPage = new IUaInboxPage(driver);
    }

    public void openNewEmailPage() {
        uaInboxPage.getMakeMessageButton().click();
    }

    public boolean isConfirmationMessageDisplayed() {
        uaInboxPage.waitForElementBeVisible(DEFAULT_TIMEOUT, uaInboxPage.getSendConfirmationMessage());
        return uaInboxPage.getSendConfirmationMessage().isDisplayed();
    }

}
