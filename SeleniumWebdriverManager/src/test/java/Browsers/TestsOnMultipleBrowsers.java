package Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestsOnMultipleBrowsers {
	  WebDriver driver;
	  
	  @Parameters("BrowserName")
	  @BeforeTest
	  public void setUp(String BrowserName) {
		 System.out.println("the thread id of "+BrowserName+ "is" + Thread.currentThread().getId());
		 if(BrowserName.equalsIgnoreCase("chrome")) {
			 WebDriverManager.chromiumdriver().setup();
			 driver=new ChromeDriver();
		 }
		 else if(BrowserName.equalsIgnoreCase("firefox")) {
			 WebDriverManager.firefoxdriver().setup();;
			 driver=new FirefoxDriver();
		 }
	 }
	  @Test
	  public void test() throws InterruptedException {
		  driver.get("https://google.com");
		  Thread.sleep(4000);
		 
	 }
	  @AfterTest
	  public void TearDown() {
		 driver.close();
		 System.out.println("test is done successfully");
	 }

}
