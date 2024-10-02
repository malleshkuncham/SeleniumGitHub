package junittutorial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Ignore;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class DemoJunitOne {

	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

    @Disabled
	@Test
	void google() {
		driver.get("https://www.google.com");
	}
	
	@Test
	void fb() {
		driver.get("https://www.facebook.com");
	}
	
	@Ignore
	@Test
	void twitter() {
		driver.get("https://www.x.com");
	}
	
	@Test
	void selenium() {
		driver.get("https://www.selenium.dev");
	}
	
	@Disabled
	@Test
	void techlearn() {
		driver.get("https://www.techlearn.in");
	}

}
