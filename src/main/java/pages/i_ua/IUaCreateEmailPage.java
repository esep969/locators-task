package pages.i_ua;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

@Getter
public class IUaCreateEmailPage extends BasePage {

    @FindBy(css = "#to")
    private WebElement addressInput;

    @FindBy(name = "subject")
    private WebElement subjectInput;

    @FindBy(css = "#text")
    private WebElement contentInput;

    @FindBy(css = "p.send_container.clear [name=send]")
    private WebElement sendEmailButton;

    public IUaCreateEmailPage(WebDriver driver) {
        super(driver);
    }
}
