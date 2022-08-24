package pages.ukr_net;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

@Getter
public class UkrNetHomePage extends BasePage {

    @FindBy(name = "login")
    private WebElement loginInput;

    @FindBy(name = "password")
    private WebElement passwordInput;

    @FindBy(css = "button[type=submit]")
    private WebElement submitButton;

    public UkrNetHomePage(WebDriver driver) {
        super(driver);
    }
}
