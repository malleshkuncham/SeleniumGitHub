package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowsers {

	static WebDriver driver;

	public static void main(String[] args) throws Exception {

		// WebDriver driver =  new ChromeDriver();

		// ChromeDriver driver = new ChromeDriver();

		driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
	//	driver.close();
		driver.quit();
	//	driver.manage().window().minimize();

	}

}
