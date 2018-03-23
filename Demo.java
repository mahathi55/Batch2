import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//System.out.println("Hello World");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://google.com");
		
		System.out.println(driver.getTitle());
		driver.get("http://yahoo.com");
		//driver.navigate().back();
		//driver.navigate().forward();
		//driver.navigate().refresh();
		
		driver.close();
		driver.quit();
		
		
		
		
		
		
		
		
	}

}
