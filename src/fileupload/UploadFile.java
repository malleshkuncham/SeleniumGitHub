package fileupload;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class UploadFile {
	WebDriver driver;
	@Test
	public void scrolldown() throws InterruptedException {
		driver.get("https://www.gangaaram-tech.com/registration/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//textarea[@id='field-ZLU4n03fXhsg9kn']")).sendKeys("Hi Mallesh");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='field-ioa3T81OSsEXwhP']")).sendKeys("F:\\Purushotham\\Test.JPG");
		
	}
	
	
	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
