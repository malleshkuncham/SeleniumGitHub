package alertwindowhandles;

import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class AlertWidnows {
	WebDriver driver;

	@Test
	public void alertok() throws InterruptedException {
		driver.get("http://seleniumlearn.com/confirmation-dialog-box");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();
		
	}

	
	@Test
	public void alertcancel() throws InterruptedException {
		driver.get("http://seleniumlearn.com/confirmation-dialog-box");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		Thread.sleep(3000);
		
		driver.switchTo().alert().dismiss();
		
	}
	
	
	@Test
	public void alertsendtextokcancel() throws InterruptedException {
		driver.get("http://seleniumlearn.com/prompt-dialog-box");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"node-103\"]/div/div[1]/div/div/button")).click();
		Thread.sleep(3000);
		
		Alert alt = driver.switchTo().alert();
		alt.sendKeys("Alekya");
		alt.accept();
		
	/* driver.switchTo().alert().sendKeys("Dinesh");
		Thread.sleep(3000);
		driver.switchTo().alert().accept(); 
		*/

	}
	
	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
