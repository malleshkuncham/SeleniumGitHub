

package verifytitleurlapptext;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class TabtitleURLappText {
	WebDriver driver;

	@Test
	public void verifytabtitle() {
		driver.get("https://www.google.com");

		String exptabtitle = "Google";
		System.out.println("Expcted tab title is :" + exptabtitle);

		String acttabtitle = driver.getTitle();
		System.out.println("Actual tab title is :" + acttabtitle);

		Assert.assertEquals(acttabtitle, exptabtitle);

	}

	@Test
	public void verifyappurl() {
		driver.get("https://www.google.com");

		String expurl = "https://www.google.com/";

		String acturl = driver.getCurrentUrl();

		Assert.assertEquals(acturl, expurl);

	}

	@Test
	public void verifyapptext() {
		driver.get("https://www.google.com");

		String expgtext = "Gmail";

		String actgtext = driver.findElement(By.xpath("//a[contains(@aria-label,'Gmail')]")).getText();

		Assert.assertEquals(actgtext, expgtext);

		String expimgtext = "Images";

		String actimgtext = driver.findElement(By.xpath("//a[@aria-label='Search for Images ']")).getText();

		Assert.assertEquals(actimgtext, expimgtext);

	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
