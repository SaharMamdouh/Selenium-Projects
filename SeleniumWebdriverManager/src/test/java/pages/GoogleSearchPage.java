package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage {
	private static WebElement Element=null;
	
	public static WebElement textbox(WebDriver driver) {
	Element = driver.findElement(By.name("q"));
	return Element;
		
	}
	
	public static WebElement searchButton(WebDriver driver) {
		
		Element = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]"));
		return Element;
	}
	

}
