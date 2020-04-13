import org.junit.Test;
import pages.MailInboxPage;

public class MailInboxTest {
	@Test
	public void openWriteMessageForm() {
		new MailInboxPage().writeMessageButton.click();
	}
}
