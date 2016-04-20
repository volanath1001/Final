package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BingTest {
	
	WebDriver driver = null;
	
	@Test
	public void b(){
		
		driver = new FirefoxDriver();
		driver.get("http://www.bing.com");
		
		String s = driver.getTitle();

		Assert.assertFalse(s.equals("Google"));
		Assert.assertTrue(!s.equals("Google"));
		
		//Assert.fail();
	
	}
	

}
