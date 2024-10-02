package locators;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class SeleniumLocators {
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Disabled
	@Test
	void idnameclassnamecssselector() throws InterruptedException {
		Thread.sleep(2000);
		driver.get("http://hyderabadreport.com/user");
		Thread.sleep(2000);
		
		driver.findElement(By.id("edit-name")).sendKeys("mallesh");
		Thread.sleep(2000);

		driver.findElement(By.name("pass")).sendKeys("abc");
		Thread.sleep(2000);

		driver.findElement(By.className("form-submit")).click();
		
	/*	driver.findElement(By.cssSelector("input#edit-submit")).click();
		driver.findElement(By.cssSelector("#edit-submit")).click();
		
		driver.findElement(By.cssSelector("input.form-submit")).click();
		driver.findElement(By.cssSelector(".form-submit")).click(); */


	}
	
	@Test
	void linkpartial() throws InterruptedException {
		Thread.sleep(2000);
		driver.get("http://hyderabadreport.com/user");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Photos")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("News")).click();		
		
	}

	@Test
	void numberoflinks() throws InterruptedException {
		Thread.sleep(2000);
		driver.get("http://hyderabadreport.com/");
		Thread.sleep(2000);
		
		List<WebElement> timg = driver.findElements(By.tagName("img"));
		System.out.println("Total number of Images on Hyderabadreport website : "+timg.size());
			

	}
	
	@Test
	void xpath() throws InterruptedException {
		Thread.sleep(2000);
		driver.get("http://hyderabadreport.com/user");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/main/div/section/div/div[1]/form/div/div[1]/input")).sendKeys("Malli");		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"edit-pass\"]")).sendKeys("abc");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"edit-submit\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/nav/div/ul/li[7]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/nav/div/ul/li[13]/a")).click();
		
		driver.findElement(By.xpath("//a[normalize-space()='International']")).click();
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/main[1]/div[1]/section[1]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")).sendKeys("Test");
		
		
		
			
		
		
		
	}

}
