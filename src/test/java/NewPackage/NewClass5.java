package NewPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewClass5 {
	
	@Test
	public void test1() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://hrmsdemo.tdesk.io/login");
	}
	

}
