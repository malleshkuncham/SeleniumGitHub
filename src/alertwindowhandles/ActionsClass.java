package alertwindowhandles;

import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class ActionsClass {
	WebDriver driver;

	@Test
	public void alertok() throws InterruptedException {
		driver.get("http://seleniumlearn.com/confirmation-dialog-box");
		Thread.sleep(3000);
		
		
	}

	
	
	
	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
