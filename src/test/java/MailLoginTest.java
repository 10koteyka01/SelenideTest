import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pages.MailInboxPage;
import pages.MailLoginPage;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class MailLoginTest {
	@Before
	public void before() {
		SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(false));
		Configuration.timeout = 10000;
		DriverFactory.useBrowser(DriverFactory.Drivers.Google);
//		DriverFactory.useHeadlessBrowser();
	}

	@Test
	public void loginTest() {
		open("http://www.mail.ru/");

		new MailLoginPage().inputLogin("ivan.test1985.ivanov")
				.submitLogin()
				.inputPassword("fsfw24dsad2SD")
				.submitPassword();

		sleep(5000);
		Assert.assertTrue("Не туда залогинились", new MailInboxPage().userEmail.getText().contains("ivan.test1985.ivanov"));
		Assert.assertTrue("Редирект не произошёл", WebDriverRunner.url().contains("https://e.mail.ru/inbox/"));
	}
}
