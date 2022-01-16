package Test;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleSearchPage;

public class searchPage {
	private static WebDriver driver=null;
	public static void main(String[] args) {
		GoogleSearch();
		
	}
	
	public static void GoogleSearch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://google.com");
		
		// go to the search bar
//		WebElement textbox = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div[2]/div[2]/input"));
//		textbox.sendKeys("automation step by step");
		GoogleSearchPage.textbox(driver).sendKeys("automation step by step");
		GoogleSearchPage.searchButton(driver).sendKeys(Keys.RETURN);
//		driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
		//driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).sendKeys(Keys.RETURN);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
		}

}
