import com.codeborne.selenide.Configuration;

public class DriverFactory {
	public enum Drivers {
		Google,
		Gecco
	}

	public static void useBrowser(Drivers drivers) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/resources/chromedriver.exe");
		System.setProperty("selenide.browser", "Chrome");
	}

	public static void useHeadlessBrowser() {
		Configuration.headless = true;
	}
}
