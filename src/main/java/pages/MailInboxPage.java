package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;

public class MailInboxPage {
	public SelenideElement userEmail = $(byId("PH_user-email"));

	public SelenideElement writeMessageButton = $(byCssSelector("#app-canvas svg path"));
}
