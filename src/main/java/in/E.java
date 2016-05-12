package in;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class E {
	
	@Test
	public void t() throws InterruptedException{
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.armani.com");
		
		Thread.sleep(3000);
		driver.findElement(By.id("cboxClose")).click();//*[@data-id='177613']//img[@class='mainImage photo']
		Thread.sleep(3000);

		WebElement element = driver.findElement(By.xpath("//*[@data-id='177613']//img[@class='mainImage photo']"));
		new Actions(driver).moveToElement(element).perform();

		driver.findElement(By.xpath("//*[@data-id=\"177613\"]//span[text()='MEN']/..")).click();
	
		
		//((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
		Thread.sleep(5000);
		//((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-100)");

		
		
		
	}
	

}
