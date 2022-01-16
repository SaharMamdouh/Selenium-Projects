package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessBrowserDemo {
   static WebDriver driver;
   public static void main(String[] args) {
	   test();
  }
   public static void test() {
	   WebDriverManager.chromedriver().setup();
	   ChromeOptions options = new ChromeOptions();
	   
	   //options.addArguments("start-maximized");
	   options.addArguments("headless");
	   options.addArguments("version");
	   driver = new ChromeDriver(options);
	   driver.get("https://google.com");
	   System.out.println(driver.getTitle());
	   driver.findElement(By.name("q")).sendKeys("automation step by step");
	   driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).sendKeys(Keys.RETURN);
	   driver.close();
	   System.out.println("completed");
   }
   
}
