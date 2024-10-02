package screenshot;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class SelectedWebElementScreenshot {
	WebDriver driver;

	@Test 
	public void TakeScreenShot() throws Exception{
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		
						
		WebElement logo = driver.findElement(By.xpath("//img[@alt='Google']"));

		File f = logo.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("E:\\Screenshots\\googlelogo.png")); 
		
		
		
	/*	WebElement s = driver.findElement(By.name("q"));
		s.sendKeys("TestNG"); */
		
	//	driver.findElement(By.name("q")).sendKeys("TestNG");
	}
	


	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
}
