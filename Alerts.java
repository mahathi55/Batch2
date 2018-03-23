import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	
	driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
	driver.findElement(By.xpath("//input[@value='Confirmation Alert']")).click();
	
	String alertontext = driver.switchTo().alert().getText();
	 System.out.println(alertontext);
	 driver.switchTo().alert().accept();
	 driver.switchTo().alert().dismiss(); // dismiss the alert
	
	driver.switchTo().alert().sendKeys("feee");
		
}

}