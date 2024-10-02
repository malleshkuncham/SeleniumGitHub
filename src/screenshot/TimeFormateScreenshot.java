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
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class TimeFormateScreenshot {
WebDriver driver;
	
	public void TakeaScreenshot() throws IOException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy_MMM_dd HH_mm_ss");
		Date date = new Date();
		String time = dateFormat.format(date);

		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("E:\\Screenshots\\Google_" + time + ".png"));
	}	

	@Test
	public void googlesearch() throws Exception {
		driver.get("https://google.com");
		Thread.sleep(2000);
		TakeaScreenshot();
		
		driver.findElement(By.name("q")).sendKeys("Bengaluru");
		Thread.sleep(1000);
		TakeaScreenshot();
		
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		TakeaScreenshot();
		
		driver.findElement(By.id("hdtb-tls")).click();
		Thread.sleep(1000);
		TakeaScreenshot();
	}

	

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
}
