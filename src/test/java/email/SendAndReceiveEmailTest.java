package email;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SendAndReceiveEmailTest extends BaseTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(SendAndReceiveEmailTest.class);

    @ParameterizedTest
    @DisplayName("Test send and receive email")
    @CsvFileSource(resources = "/test_data.csv", numLinesToSkip = 1)
    public void testSendAndReceiveEmail(String iUaLogin, String iUaPass, String ukrNetLogin, String ukrNetPass) {
        String subject = UUID.randomUUID().toString();
        String text = UUID.randomUUID().toString();
        LOGGER.info("Generated subject: {}", subject);
        LOGGER.info("Generated email text: {}", text);

        iUaHomePageSteps.openHomePage(I_UA_URL);
        iUaHomePageSteps.loginToAccount(iUaLogin,iUaPass);
        iUaInboxPageSteps.openNewEmailPage();
        iUaCreateEmailPageSteps.writeAndSendEmail(ukrNetLogin, subject, text);
        assertTrue(iUaInboxPageSteps.isConfirmationMessageDisplayed());

        ukrNetHomePageSteps.openPage(UKR_NET_URL);
        ukrNetHomePageSteps.loginToAccount(ukrNetLogin, ukrNetPass);
        ukrNetInboxPageSteps.openEmailBySubject(subject);
        assertEquals(subject, ukrNetEmailPageSteps.getSubject());
        assertEquals(iUaLogin, ukrNetEmailPageSteps.getFromEmail());
        assertTrue(ukrNetEmailPageSteps.getEmailText().contains(text));
        LOGGER.info("Email is {}", ukrNetEmailPageSteps.deleteEmail() ? "deleted" : "not deleted");
    }


}
