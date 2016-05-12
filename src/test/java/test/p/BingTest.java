package test.p;


import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import testBase.BaseTest;

public class BingTest extends BaseTest{
	
	
	@Test
	public void b(){
		char g = 3;
		driver = new FirefoxDriver();
		driver.get("http://www.bing.com");
		
		String s = driver.getTitle();

		//Assert.assertFalse(s.equals("Google"));
		//Assert.assertTrue(!s.equals("Google"));
		assertEquals(45, "45");
		//Assert.fail();
		
		System.out.println("HHHHFHJFJFjyf");
	
	}
	

}
