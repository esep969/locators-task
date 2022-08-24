package steps.i_ua;

import org.openqa.selenium.WebDriver;
import pages.i_ua.IUaCreateEmailPage;

public class IUaCreateEmailPageSteps {

    private IUaCreateEmailPage createEmailPage;

    public IUaCreateEmailPageSteps(WebDriver driver){
        createEmailPage = new IUaCreateEmailPage(driver);
    }

    public void writeAndSendEmail(String to, String subject, String emailContent) {
        createEmailPage.getAddressInput().sendKeys(to);
        createEmailPage.getSubjectInput().sendKeys(subject);
        createEmailPage.getContentInput().sendKeys(emailContent);
        createEmailPage.getSendEmailButton().click();
    }
}
