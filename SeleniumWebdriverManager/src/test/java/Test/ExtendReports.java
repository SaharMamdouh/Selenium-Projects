package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtendReports {
	
	private static WebDriver driver=null;
	public static void main(String[] args) {
//		ExtentReporter htmlReporter = new ExtentReporter (); 
		ExtentSparkReporter spark = new ExtentSparkReporter("Spark.html");
		//create extent reports and attach reporter
		ExtentReports extent =  new ExtentReports();
		extent.attachReporter(spark);
		
		//create test
		ExtentTest Test1 = extent.createTest("test the search bar", "to make sure the textbox in google search works perfectly");
      //setup
		WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        Test1.log(Status.INFO, "starting test case");
        driver.get("https://google.com");
        Test1.pass("navigated to google.com");
        //getting the elements and sending data
        driver.findElement(By.name("q")).sendKeys("automation step by step");
        Test1.pass("insert data in the search bar");
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).sendKeys(Keys.RETURN);
        Test1.pass("pressed the enter keybaord");
        driver.close();
        Test1.pass("closed the browser");
        Test1.info("test completed");
        //calling flush writes everything in the log file 
        extent.flush();
       
       
		
	}

}
