package email;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import steps.i_ua.IUaCreateEmailPageSteps;
import steps.i_ua.IUaHomePageSteps;
import steps.i_ua.IUaInboxPageSteps;
import steps.ukr_net.UkrNetEmailPageSteps;
import steps.ukr_net.UkrNetHomePageSteps;
import steps.ukr_net.UkrNetInboxPageSteps;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public abstract class BaseTest {
    protected WebDriver driver;
    protected IUaHomePageSteps iUaHomePageSteps;
    protected IUaInboxPageSteps iUaInboxPageSteps;
    protected IUaCreateEmailPageSteps iUaCreateEmailPageSteps;
    protected UkrNetHomePageSteps ukrNetHomePageSteps;
    protected UkrNetInboxPageSteps ukrNetInboxPageSteps;
    protected UkrNetEmailPageSteps ukrNetEmailPageSteps;

    public static final String I_UA_URL = "https://www.i.ua/";
    public static final String UKR_NET_URL = "https://accounts.ukr.net/";

    @BeforeEach
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.of(5, ChronoUnit.SECONDS));
        iUaHomePageSteps = new IUaHomePageSteps(driver);
        iUaInboxPageSteps = new IUaInboxPageSteps(driver);
        iUaCreateEmailPageSteps = new IUaCreateEmailPageSteps(driver);
        ukrNetHomePageSteps = new UkrNetHomePageSteps(driver);
        ukrNetInboxPageSteps = new UkrNetInboxPageSteps(driver);
        ukrNetEmailPageSteps = new UkrNetEmailPageSteps(driver);
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
