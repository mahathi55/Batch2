import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirefoxexmmpRadiobuttons {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://www.echoecho.com/htmlforms10.htm");
	//	driver.findElement(By.xpath("//input[@value='Cheese']")).click();
	//	System.out.println(driver.findElements(By.xpath("//input[@name='group1']")).size());

	// print all the checkboxes one by one
	   int count = driver.findElements(By.xpath("//input[@name='group1']")).size();
		
		for(int i=0;i<count;i++)
		{
			//driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
			// System.out.println(driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value"));
	
			//rather than system take this 
		
			String text = driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
			if(text.equals("Milk"))
		{
			driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
		}
		
		
//		driver.close();

	}
	}
}
