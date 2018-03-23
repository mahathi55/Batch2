

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Implicitexp {

	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://alaskatrips.poweredbygps.com/g/pt/hotels?MDPCID=ALASKA-US.TPS.BRAND.hotels.HOTEL");
		driver.findElement(By.id("H-destination")).sendKeys("nyc");
		driver.findElement(By.id("H-destination")).sendKeys(Keys.TAB);
		driver.findElement(By.id("H-fromDate")).sendKeys(Keys.ENTER);
		
		// explicit wait
		WebDriverWait d = new WebDriverWait(driver ,20);
		//d.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//a[contains(@href,'New-York-Hotels-The-Time')]")));
		
		d.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@href,'New-York-Hotels-The-Time')]")));
		
		driver.findElement(By.xpath("//a[contains(@href,'New-York-Hotels-The-Time')]")).click();
		
		
	}

}
