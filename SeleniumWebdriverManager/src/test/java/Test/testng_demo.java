package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.getPropertiesData;
import io.github.bonigarcia.wdm.WebDriverManager;

public class testng_demo {
	WebDriver driver = null;
	public static String BrowserName=null;
  @BeforeTest
  public void setUpDriver() {
	  getPropertiesData.getProperties();
	  if (BrowserName.equalsIgnoreCase("chrome")) {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  }
	  
	  else if (BrowserName.equalsIgnoreCase("firefox")) {
		  WebDriverManager.firefoxdriver().setup();
		  driver = new FirefoxDriver();
		  }
  }
	
  @Test
  public void SearchBar() {
	  driver.get("https://google.com");
	  driver.findElement(By.name("q")).sendKeys("facebook");
	  driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).sendKeys(Keys.RETURN);
  }
  
  @AfterTest
  public void closeBrowser() {
	  System.out.println("Test Completed Succefully!");
	  driver.close();
	  getPropertiesData.setProperties();
  }
  
}
