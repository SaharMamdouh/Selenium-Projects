package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleSearchPageObject;

public class googleSearchText {
	private static WebDriver driver = null;
	public static void main(String[] args) {
		
		googleSearchTest();
	}
	
	public static void googleSearchTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://google.com");
		GoogleSearchPageObject searchobj = new GoogleSearchPageObject(driver);
		searchobj.textboxSearch("A B C D");
		searchobj.pressOnSearchButton();
		driver.close();
	}

}
