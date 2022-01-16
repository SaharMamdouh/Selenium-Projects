package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelData {
	WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	@Test(dataProvider="test1Data")
	public void test(String username , String password) {
		System.out.println(username +" | "+ password);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
	}
	
	@DataProvider (name="test1Data")
	public  Object[][] getData() {
		Object data[][] = testData(".\\Excel\\data.xlsx","Sheet1");
		return data;
	}

	public Object[][] testData(String excelpath , String sheetname) {
		ExcelUtils excel= new ExcelUtils(excelpath,sheetname);
        int rowCount = excel.getRowCount();
        int colCount= excel.getColCount();
        Object[][] dataObject = new Object [ rowCount-1][colCount];
        
        for (int i=1; i<rowCount; i++) {
        	for(int j=0; j<colCount;j++) {
        		String data=excel.getCellString(i, j);
        		System.out.println(data);
        		dataObject[i-1][j]=data;
        	}
        }
        return dataObject;
	}

}
