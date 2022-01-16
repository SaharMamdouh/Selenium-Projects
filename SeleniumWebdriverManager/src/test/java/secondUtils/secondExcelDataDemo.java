package secondUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class secondExcelDataDemo {
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	@Test(dataProvider="testdata")
	public void providingData(String username , String password) {
		System.out.println(username +" | "+password);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
	}
	
	
	
	@DataProvider(name="testdata")
	public  Object[][] TestData() {
		Object fulldata [][]= loopingOnData(".\\Excel\\DataDriven.xlsx","Sheet1");
		return fulldata;
	}
	
	public static Object[][] loopingOnData(String excelPath , String sheetName) {
		secondExcelData excel = new secondExcelData(excelPath,sheetName );
		int rowcount =excel.getRowCount();
		int colcount = excel.getColCount();
		Object [][] DataObject = new Object[rowcount-1][colcount];
		
		for (int i=1; i<rowcount ; i++) {
			for(int j=0; j<colcount; j++) {
				String data = excel.getStringData(i, j);
				System.out.println(data);
				DataObject[i-1][j]= data;
				
			}
		}
		return DataObject;
	}

}
