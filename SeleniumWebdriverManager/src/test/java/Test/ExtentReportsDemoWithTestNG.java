package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportsDemoWithTestNG {
	ExtentSparkReporter Reporter;
	ExtentReports extent;
	WebDriver driver ;
	
  @BeforeSuite
  public void SetUp() {
	  Reporter = new ExtentSparkReporter("extent.html");
	  //create extent and attach reporter
	  extent = new ExtentReports();
	  extent.attachReporter(Reporter);
  }
  
  @BeforeTest
  public void setUpBrowser() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
  }
  
  @Test
  public void Test() {
	  ExtentTest FirstTest = extent.createTest("Google Search", "testing Google Search using testng");
	  FirstTest.log(Status.INFO, "first test case");
	  driver.get("https://google.com");
	  FirstTest.pass("navigate to google.com");
  }
  
  @AfterTest
  public void closingBrowser() {
	  driver.close();
	  System.out.println("test done successfully!");
  }
  @AfterSuite
  public void TearDown() {
	  extent.flush();
  }
}
