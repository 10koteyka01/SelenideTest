package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class MailLoginPage {

	private SelenideElement loginField = $(byName("login"));

	private SelenideElement passwordField = $(byName("password"));;

	private SelenideElement enterPasswordButton = $(byXpath("//*[@id='mailbox:submit']/input"));

	private SelenideElement enterButton = $(byXpath("//*[@id='mailbox:submit']/input"));

	@Step ("Ввести логин {login}")
	public MailLoginPage inputLogin(String login) {
		loginField.sendKeys(login);
		return this;
	}

	@Step ("Ввести пароль {password}")
	public MailLoginPage inputPassword(String password) {
		passwordField.sendKeys(password);
		return this;
	}

	@Step ("Подтвердить ввод логина нажатием кнопки")
	public MailLoginPage submitLogin() {
		enterPasswordButton.click();
		return this;
	}

	@Step ("Подтвердить ввод пароля нажатием кнопки")
	public MailLoginPage submitPassword() {
		enterButton.click();
		return this;
	}
}
