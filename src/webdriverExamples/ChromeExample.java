package webdriverExamples;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ChromeExample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub 
		System.setProperty("webdriver.chrome.driver", "D:/Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		WebElement element=driver.findElement(By.id("gbqfq"));
		Thread.sleep(10000);
		element.sendKeys("books");
		element.submit();		
		driver.quit();	
	}

}
