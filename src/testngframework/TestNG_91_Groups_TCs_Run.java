package testngframework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_91_Groups_TCs_Run {
	WebDriver driver;

	@Test(groups="food")
	public void zomato() {
		driver.get("https://www.zomato.com");
	}
	
	@Test(groups="social")
	public void twitter() {
		driver.get("https://www.x.com");
	}
	
	@Test(groups="social")
	public void facebook() {
		driver.get("https://www.facebook.com");
	}	
	
	@Test(groups="food")
	public void swiggy() {
		driver.get("https://www.swiggy.com");
	}
	
	@Test(groups="search")
	public void google() {
		driver.get("https://www.google.com");
	}
	
	@Test(groups="tech")
	public void selenium() {
		driver.get("https://www.selenium.dev");
	}
	
	@Test(groups="social")
	public void gmail() {
		driver.get("https://www.gmail.com");
	}
	
	@Test(groups="tech")
	public void redmine() {
		driver.get("https://www.redmine.org");
	}

	@BeforeTest(groups="food")
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
