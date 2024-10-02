package isDisplayedisEnabledisSelected;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class IsDisplayedisEnabledisSelected {
	WebDriver driver;

	@Test
	public void isDisplayedfeature() {
		driver.get("https://www.redmine.org/");
		
		boolean	sign = driver.findElement(By.xpath("//a[@class='login']")).isDisplayed();
		
		if(sign==true)
		{
			System.out.println("Signin link text is available in home page");
			driver.findElement(By.xpath("//a[@class='login']")).click();
		}
		
		else
		{
			System.out.println("Signin link text is Not available in home page");

		}
	}
	
	@Test
	public void isEnabledfeature() {
		driver.get("https://www.redmine.org/");

		driver.findElement(By.xpath("//a[@class='login']")).click();
		
		boolean log = driver.findElement(By.xpath("//input[@id='username']")).isEnabled();
		
		if(log==true)
		{
			System.out.println("Login text box is enabled to the enter username");
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("mallesh");
		}
		
		else {
			System.out.println("Login text box is Not enabled to the enter username");

		}
		
		}
	
	@Test
	public void isSelectedfeature() {
		driver.get("https://www.redmine.org/");

		driver.findElement(By.xpath("//a[@class='login']")).click();
		
		driver.findElement(By.xpath("//input[@id='autologin']")).click();
		
		boolean check = driver.findElement(By.xpath("//input[@id='autologin']")).isSelected();
		
		if(check==true)
		{
			System.out.println("Stay logged in checkbox is Selected");
		}
		
		else {
			System.out.println("Stay logged in checkbox is Not Selected");

		}
		
		}
		
		


	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
