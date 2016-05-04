package test.f.createAccount;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.testng.internal.BaseTestMethod;

import actions.HomePageActions;
import testBase.BaseTest;

public class CreateAccount_formValidation extends BaseTest{
	
	
	@Test
	public void formValidation(){
		HomePageActions homePage = new HomePageActions(/*driver*/);

		//driver.findElement(By.className("")).sendKeys(Keys.SEPARATOR);
		
		//homePage.firstName_TB.s
		
		//waitUntilElementDisplayed(element)
		System.out.println();
		homePage.formFill("", "", "");
		//homePage.firstName_TB.sendKeys("masud");
	}

}
