
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoSalesforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//System.out.println("Hello World");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://login.salesforce.com");
	//	driver.findElement(By.className("input r4 wide mb16 mt8 username")).sendKeys("hello");
		//compound class names are not permitted above statement
		
		//driver.findElement(By.id("username")).sendKeys("hello");
		//driver.findElement(By.name("pw")).sendKeys("234234");
	 	//driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
	 //	System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
		
	 	
	//	driver.findElement(By.cssSelector(selector)))
	 	
	 	
	 	
		//driver.close();


		
		
		
		
		
		
		
		
	}

}
