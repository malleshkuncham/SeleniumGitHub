package demotestng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_Invocation_Count {
	WebDriver driver;

	
	@Test
	public void google() {
		driver.get("https://www.google.com");
	}
	
	@Test(invocationCount=3)
	public void selenium() {
		driver.get("https://www.selenium.dev");
	}
	
	

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
