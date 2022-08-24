package steps.ukr_net;

import org.openqa.selenium.WebDriver;
import pages.ukr_net.UkrNetInboxPage;

import java.util.stream.Collectors;

public class UkrNetInboxPageSteps {

    private UkrNetInboxPage inboxPage;

    public UkrNetInboxPageSteps(WebDriver driver) {
        inboxPage = new UkrNetInboxPage(driver);
    }

    public void openEmailBySubject(String subject) {
        inboxPage.getInboxEmails().stream()
                .filter(webElement -> webElement.getText().contains(subject))
                .collect(Collectors.toList())
                .get(0).click();
    }
}
