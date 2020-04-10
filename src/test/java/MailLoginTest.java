import com.codeborne.selenide.Configuration;
import org.junit.Before;
import org.junit.Test;
import pages.MailLoginPage;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Selenide.*;

public class MailLoginTest {
	@Before
	public void before() {
		Configuration.timeout = 10000;
		DriverFactory.useBrowser(DriverFactory.Drivers.Google);
		DriverFactory.useHeadlessBrowser();
	}

	@Test
	public void loginTest() {
		open("http://www.mail.ru/");

		new MailLoginPage().inputLogin("ivan.test1985.ivanov")
				.submitLogin()
				.inputPassword("fsfw24dsad2SD")
				.submitPassword();

		$("title").shouldHave(attribute("text", "(6) Входящие - Почта Mail.ru"));
	}
}
