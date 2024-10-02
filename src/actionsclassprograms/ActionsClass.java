package actionsclassprograms;

import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class ActionsClass {
	WebDriver driver;

	@Test
	public void rightclick() throws InterruptedException {
		driver.get("http://seleniumlearn.com/");
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		act.contextClick(driver.findElement(By.xpath("//a[normalize-space()='Sikuli']"))).build().perform();
		
	}
	
	/*@Test
	public void doubleclick() throws InterruptedException {
		driver.get("http://seleniumlearn.com/double-click");
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		act.doubleClick(driver.findElement(By.xpath("//button[normalize-space()='Techlearn.in']"))).build().perform();
	//	act.moveToElement(driver.findElement(By.xpath("//button[normalize-space()='Techlearn.in']"))).doubleClick().build().perform();
		
	}
	
	@Test
	public void mouseover() throws InterruptedException {
		driver.get("http://seleniumlearn.com/");
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[@href='/selenium']"))).build().perform();
		Thread.sleep(3000);
		//act.moveToElement(driver.findElement(By.xpath("//a[normalize-space()='Selenium Quiz']"))).click().build().perform();
		driver.findElement(By.xpath("//a[normalize-space()='Selenium Quiz']")).click();
	}
	
	@Test
	public void draganddrop() throws InterruptedException {
		driver.get("http://www.seleniumlearn.com/drag-and-drop-html");
		Thread.sleep(3000);
		
		Actions act = new Actions(driver);
		
		WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
		
		WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		act.dragAndDrop(source, target).build().perform();*/

	
	
	@Test
	public void keyboardkeys() throws InterruptedException {
		driver.get("https://www.redmine.org/login");
		Thread.sleep(3000);
		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB).build().perform();
		

	}
	
	

	
	
	
	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
