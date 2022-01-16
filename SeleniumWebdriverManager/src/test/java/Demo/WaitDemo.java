package Demo;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitDemo {
	static WebDriver driver;
	public static void main(String[] args) {
		waitElementLoaded();
	}
	
	public static void waitElementLoaded() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("abcd");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).sendKeys(Keys.RETURN);
		//driver.findElement(By.linkText("/url?sa=t&source=web&rct=j&url=https://give.adomdevelopment.org/abcd&ved=2ahUKEwi22KTx8LP1AhWEA2MBHf8aBQ44ChAWegQIKRAB")).click();
		
		 Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				 .withTimeout(Duration.ofSeconds(30))
				 .pollingEvery(Duration.ofSeconds(5))
			      .ignoring(NoSuchElementException.class);

			   WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
			     public WebElement apply(WebDriver driver) {
			      WebElement linkElement = driver.findElement(By.linkText("ABCD Action for Boston Community Development"));
			      if (linkElement.isEnabled()) {
			    	  System.out.println("Element Found");
			      }
			      return linkElement;
			     }
			     
			     
			   });
			   foo.click();
		driver.close();
		
	}

}
