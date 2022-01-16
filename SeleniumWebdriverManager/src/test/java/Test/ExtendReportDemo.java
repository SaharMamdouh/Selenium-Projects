package Test;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendReportDemo {
    private static WebDriver driver = null;
	public static void main(String[] args) {
		ExtentSparkReporter sparkReporter= new ExtentSparkReporter("extent.html");
		// create extent reporter and attach the sparkreporter
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(sparkReporter);
		//create test 
		ExtentTest test= extent.createTest( "Google Search","testing textbox of google");
		test.log(Status.INFO, "starting test case");
		

	}

}
