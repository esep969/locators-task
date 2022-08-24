package pages.ukr_net;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

@Getter
public class UkrNetEmailPage extends BasePage {

    @FindBy(css = "h3.readmsg__subject")
    private WebElement subject;

    @FindBy(css = "a.readmsg__head-contact.main em")
    private WebElement email;

    @FindBy(css = "pre")
    private WebElement text;

    @FindBy(css = "a.remove")
    private WebElement deleteEmailButton;

    @FindBy(css = "div.info.show")
    private WebElement deleteConfirmationMessage;

    public UkrNetEmailPage(WebDriver driver) {
        super(driver);
    }

}
