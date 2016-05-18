package test.f.createAccount;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class B2 {
	
	int i =1;
	@Test(priority=10, invocationCount=10,threadPoolSize=5)
	public void t1(){
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		System.out.println(" B2 - 1");
		System.out.println(i);
		i++;
	}
	
	@Test(priority=1)
	public void t2(){
		System.out.println(" B2 - 2");
	}
	
	@Test(priority=2)
	public void t3(){
		System.out.println(" B2 - 3");
	}

}
