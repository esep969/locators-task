package pages.i_ua;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class IUaHomePage extends BasePage {

    @FindBy(css = "form[name=lform] input[name=login]")
    private WebElement loginInput;

    @FindBy(css = "form[name=lform] input[name=pass]")
    private WebElement passwordInput;

    @FindBy(css = "form[name=lform] input[type=submit]")
    private WebElement submitButton;

    public IUaHomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getLoginInput() {
        return loginInput;
    }

    public WebElement getPasswordInput() {
        return passwordInput;
    }

    public WebElement getSubmitButton() {
        return submitButton;
    }

}
