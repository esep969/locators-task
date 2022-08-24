package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public abstract class BasePage {

    protected WebDriver driver;
    public static final long DEFAULT_TIMEOUT = 10;

    public BasePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void openPage(String url) {
        driver.get(url);
    }

    public void waitForElementBeVisible(long timeToWait, WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.of(timeToWait, ChronoUnit.SECONDS));
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
