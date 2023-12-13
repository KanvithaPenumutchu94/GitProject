package NewPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewClass1 {
	
	@Test
	public void test1() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://github.com/");
	}
	

}
