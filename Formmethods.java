import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Formmethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	//System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver_win32\\chromedriver.exe");
	//WebDriver driver = new ChromeDriver();
	
	System.setProperty("webdriver.gecko.driver", "C:\\Program Files (x86)\\geckodriver-v0.19.1-win64\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	
/*	driver.get("https://www.makemytrip.com/");
	System.out.println("Before clicking on mutlicity option");
	
	driver.findElement(By.xpath("//*[@id='hp-widget__sfrom']")).isDisplayed();	
	
	driver.findElement(By.xpath("//input[@value='MultiCity']")).click();
	System.out.println("After clickin on multicty option");
	driver.findElement(By.xpath("//*[@id='js-multiCitySearchFrom_1']")).isDisplayed();	
	*/
	/*
	driver.get("http://facebook.com");
	System.out.println(driver.findElement(By.id("email")).isDisplayed());
	
	System.out.println(driver.findElement(By.id("pss")).isDisplayed());// unable to locate the element
	
	int count = driver.findElements(By.id("pss")).size();
	if(count==0)
	{
	 System.out.println("verified");	
	}

	*/
	//is enabled
	
	/*driver.get("http://www.plus2net.com/javascript_tutorial/listbox-disabled-demo.php");
	System.out.println(driver.findElement(By.xpath("//input[@value='yes']")).isEnabled());
	
	driver.findElement(By.xpath("//input[@value='yes']")).click();
	*/
	
	driver.get("https://www.yatra.com/");
	Thread.sleep(3000L);
	System.out.println(driver.findElement(By.xpath("//*[@id='galleryGrid']/div/div[1]/h2")).getText());
	
	
	//driver.close();
	}
}
	
	
	
