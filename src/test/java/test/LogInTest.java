package test;

import org.openqa.selenium.By;

import org.testng.annotations.Test;


import testBase.BaseTest;

public class LogInTest extends BaseTest{
	
	@Test
	public void logIn(){
		
		
		waitUntilElementDisplayed(driver.findElement(By.className("")));
		driver.findElement(By.className(""));
		driver.findElement(By.className(""));
		driver.findElement(By.className(""));
	}

}
