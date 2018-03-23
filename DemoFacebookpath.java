import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoFacebookpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//System.out.println("Hello World");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	
		
		driver.get("http://facebook.com");	
		
		
	//	driver.findElement(By.xpath("//*[@id=\'email\']")).sendKeys("this is first code"); //keep * to search in any tag
		
	//	driver.findElement(By.xpath("//input[@id=\'email\']")).sendKeys("this is first code");//key tagname
		
	    // driver.findElement(By.cssSelector("input[id='email']")).sendKeys("hello");// syntax of css
		
		 driver.findElement(By.cssSelector("input[id*='email']")).sendKeys("hello");
		
	//     driver.findElement(By.cssSelector("[id='email']")).sendKeys("hello"); 
	   //  driver.findElement(By.cssSelector("#pass")).sendKeys("493284"); // syntax #id or #username
	 //    driver.findElement(By.cssSelector("input.inputtext")).sendKeys("3435"); // syntax tagName.classname
	     
	 
	
	//	driver.close();
		
		
		
	}

}
