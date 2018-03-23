import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebayexp {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.ebay.com/");
		
		//count of link in the entire page
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//count of links in the footer page of the section
		WebElement footer=driver.findElement(By.xpath("//*[@id='glbfooter']"));
		System.out.println(footer.findElements(By.tagName("a")).size());
		
		WebElement col =driver.findElement(By.xpath("//*[@id='gf-BIG']/table/tbody/tr/td[2]/ul"));
		System.out.println(col.findElements(By.tagName("a")).size());
		
		/*for(int i = 0;i<col.findElements(By.tagName("a")).size();i++)
		{
			System.out.println(col.findElements(By.tagName("a")).get(i).getText());
		}
		*/
		
		String Beforeclicking = null;
		String Afterclicking;

		for(int i=0;i<col.findElements(By.tagName("a")).size();i++)
		{
		
			
			if(col.findElements(By.tagName("a")).get(i).getText().contains("Site map"))
			{
				Beforeclicking = driver.getTitle();
			
				col.findElements(By.tagName("a")).get(i).click();
				break;
				}
		}
		
		Afterclicking = driver.getTitle();
		if(Beforeclicking!=Afterclicking)
		{
			if(driver.getPageSource().contains("Site Map"))
			{
				System.out.println("PASS");
			}
			
			else
			{
				System.out.println("Fail");
			}
		}
		
		

	}
}

