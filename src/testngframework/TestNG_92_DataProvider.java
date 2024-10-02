package testngframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG_92_DataProvider {
	WebDriver driver;
	
	@DataProvider(name = "datainput")
	public String[][] login() {
		return new String[][] { 
			{ "mallesh", "InValidPassword"}, 
			{ "alekhya", "9000109120" },
			{ "manasa", "ABCDEF" },
			{ "navya", "123456789" },
			{ "kamal", "ABCDEFGHI" },
			{ "mohana", "9980251000"}, 
			{ "akhil", "InValidPassword"}, 
			{ "lavanya", "9000109120" },
			{ "shiva", "Hello@123"},
			{ "chethan", "9980251000"}
			};
	}

	@Test(dataProvider = "datainput")
	public void login(String user, String pswd) throws Exception {
	
		driver.get("http://hyderabadreport.com/user");
		
		driver.findElement(By.xpath("//input[@id='edit-name']")).sendKeys(user);
		driver.findElement(By.xpath("//input[@id='edit-pass']")).sendKeys(pswd);
		driver.findElement(By.xpath("//input[@id='edit-submit']")).click();
		try 
		{
			driver.findElement(By.xpath("//a[normalize-space()='Log out']")).click();
				System.out.println("PASS");
		} 
		catch (Exception e) 
		{		
			System.out.println("FAIL");
		}
	}

	@BeforeTest
	public void beforeTest() {			
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
}