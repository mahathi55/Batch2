import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

public class DemoFacebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//System.out.println("Hello World");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	
		
		//driver.get("http://facebook.com");
	//	driver.findElement(By.id("email")).sendKeys("this is my first code");
	//	driver.findElement(By.name("pass")).sendKeys("2342894");
	//	driver.findElement(By.linkText("Forgotten account?")).click();
		//driver.findElement(By.className("inputtext")).sendKeys("hello");
		
	//	driver.findElement(By.xpath("//*[@id=\'email\']")).sendKeys("this is first code");
	//	driver.findElement(By.cssSelector("#pass")).sendKeys("493284");
	//	driver.findElement((By.cssSelector("input#pass.inputtext")).sendKeys("3424");
		
	
		//checkbox
		driver.get("http://phptravels.org/clientarea.php");
//	Select s = new Select(driver.findElement(By.xpath("//*[@name='rememberme']")));
		
		System.out.println(driver.findElement(By.xpath("//*[@name='rememberme']")).isSelected());
		driver.findElement(By.xpath("//*[@name='rememberme']")).click();
		System.out.println(driver.findElement(By.xpath("//*[@name='rememberme']")).isSelected());
		
		//driver.close();
		
		
		
	}

}
