package dropdownselection;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class SelectDropDownValues {
	WebDriver driver;

	@Test
	public void redmine() throws InterruptedException {
		driver.get("https://www.redmine.org/account/register");
		Thread.sleep(3000);
		Select dd = new Select(driver.findElement(By.xpath("//*[@id=\"user_language\"]")));
		//dd.selectByVisibleText("Dutch (Nederlands)");
		dd.selectByValue("sq");
		//dd.selectByIndex(18);
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
