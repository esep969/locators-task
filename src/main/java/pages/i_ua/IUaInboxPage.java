package pages.i_ua;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

@Getter
public class IUaInboxPage extends BasePage {

    @FindBy(css = "p.make_message")
    private WebElement makeMessageButton;

    @FindBy(css = "div.block_confirmation div.content")
    private WebElement sendConfirmationMessage;

    public IUaInboxPage(WebDriver driver) {
        super(driver);
    }
}
