import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class spicejetexp {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://spicejet.com/default.aspx");	
	
		// Static dropdown
	   Select s = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		s.selectByValue("2"); // considers value 2
		s.selectByIndex(5); // give 6 
		//  s.selectByVisibleText("5 Adults");
		
		//Dynamic dropdown
		driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT")).click();
		//driver.findElement(By.xpath("//a[@value='GOI']")).click();
		//driver.findElement(By.xpath("(//a[@value='DEL'])[2]")).click();
		

		
		
		
		
	//	driver.close();
		
		
		
	}

}
