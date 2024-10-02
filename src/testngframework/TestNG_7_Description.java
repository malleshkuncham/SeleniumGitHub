package testngframework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_7_Description {
	WebDriver driver;

	
	@Test(description="Searching for Mallesh")
	public void method1() {
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Mallesh");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

	}
	
	@Test(description="Searching for Techlearn.in")
	public void method2() {
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("techlearn.in");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}
	
	@Test(description="Searching for Tirupati")
	public void method3() {
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Tirupati");
		driver.findElement(By.name("a")).sendKeys(Keys.ENTER);

	}
	
	@Test(description="Searching for Selenium")
	public void method4() {
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Selenium");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}
	
	@Test(description="Searching for TestNG")
	public void method5() {
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("TestNG");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}
	
	@Test(description="Searching for Java")
	public void method6() {
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Java");
		driver.findElement(By.name("a")).sendKeys(Keys.ENTER);
	}
	
	@Test(description="Searching for Maven")
	public void method7() {
		driver.get("https://www.google.com");
		
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("Maven");
		
	//	driver.findElement(By.name("q")).sendKeys("Maven");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}
	
	

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}


}
