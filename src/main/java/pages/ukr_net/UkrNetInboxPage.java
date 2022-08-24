package pages.ukr_net;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

@Getter
public class UkrNetInboxPage extends BasePage {

    @FindBy(css = "tbody .msglist__row-subject a")
    private List<WebElement> inboxEmails;

    public UkrNetInboxPage(WebDriver driver) {
        super(driver);
    }

}
