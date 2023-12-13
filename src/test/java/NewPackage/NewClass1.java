package NewPackage;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class NewClass1 {

	@Test
	public void test1() {
		WebDriver driver;
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
//		Map<String, Object> prefs = new HashMap<String, Object>();
//		prefs.put("credentials_enable_service", false);
//		prefs.put("profile.password_manager_enabled", false);
//		options.setExperimentalOption("prefs", prefs);
//		options.addArguments("--remote-allow-origins=*");
//		options.addArguments("--disable-notifications");
//		options.addArguments("--use-fake-ui-for-media-stream");

		driver = new ChromeDriver(options);
		driver.get("https://github.com/");
	}

}
