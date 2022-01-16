package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testng_demo2 {
	WebDriver driver = null;
  @BeforeTest
  public void setUpDriver() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
  }
	
  @Test
  public void SearchBar() {
	  driver.get("https://google.com");
	  driver.findElement(By.name("q")).sendKeys("facebook");
	  driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).sendKeys(Keys.RETURN);
  }
  
  @Test
  public void SearchBar2() {
	  driver.get("https://google.com");
	  driver.findElement(By.name("q")).sendKeys("facebook");
	  driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).sendKeys(Keys.RETURN);
  }
  
  @AfterTest
  public void closeBrowser() {
	  System.out.println("Test Completed Succefully!");
	  driver.close();
  }
  
}
