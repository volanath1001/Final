package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.google.common.base.Predicate;

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
