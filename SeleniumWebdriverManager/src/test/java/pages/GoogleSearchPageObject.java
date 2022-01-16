package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObject {
	 WebDriver driver = null;
	
	By textbox_search = By.name("q");
	By Button_search = By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]");
	
	public GoogleSearchPageObject(WebDriver driver) {
		this.driver=driver;
	}
	
	public void textboxSearch(String text) {
		driver.findElement(textbox_search).sendKeys(text);
	}
	
	public void pressOnSearchButton() {
		driver.findElement(Button_search).sendKeys(Keys.RETURN);
	}

}
