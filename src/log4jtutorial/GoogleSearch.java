package log4jtutorial;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleSearch {
	WebDriver driver;
  @Test
  public void search() {
	  Logger log= Logger.getLogger("Google Search");
	  PropertyConfigurator.configure("Log4j.properties");
	  
	  driver = new ChromeDriver();
	  log.info("Chrome Browser is Launched");
	  
	  driver.manage().window().maximize();
	  log.info("Browser window maximized");
	  
	  driver.get("https://www.google.com");
	  log.info("Navigate to the Google Application");
	  
	  driver.findElement(By.name("q")).sendKeys("Mallesh");
	  log.info("Enter a text is Mallesh in a google search");
	  
	  driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	  log.info("Enter button pressed in Keyboard");
	  
	driver.findElement(By.name("q")).sendKeys("yashika");
	log.info("Enter a text is yashika in a google search");
	  
	  

  }
}
