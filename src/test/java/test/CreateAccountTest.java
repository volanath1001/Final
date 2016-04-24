package test;

import org.testng.annotations.Test;
import testBase.BaseTest;

public class CreateAccountTest extends BaseTest{
	
	@Test
	public void createAccount(){
		System.out.println("createAccount");
		driver.get("http://www.bn.com");
		
	}

}
