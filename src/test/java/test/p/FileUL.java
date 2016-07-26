package test.p;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FileUL {
	
	
	
	WebDriver driver = null;
	
	@Test
	public void t(){
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.MINUTES);

		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("nayonevalentine@gmail.com");
		WebElement e = driver.findElement(By.id("pass"));
		e.sendKeys("ihatelove5676");
		e.sendKeys(Keys.RETURN);
		//driver.findElement(By.id("u_0_o")).click();
		
		
		driver.findElement(By.xpath("//*[@title=\"Profile\"]/img")).click();
		new Actions(driver).moveToElement(driver.findElement(By.cssSelector(".profilePic.img"))).perform();

		driver.findElement(By.xpath("//div[text()='Update Profile Picture']")).click();

		//driver.findElement(By.xpath("//input[@class='_n _5f0v']")).click();;;
		
		
		driver.findElement(By.xpath("//input[@class='_n _5f0v']")).sendKeys("C:\\Users\\Islam\\Pictures/olive branch.jpg");;

		

	}

}
