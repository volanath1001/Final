package testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	
	WebDriver driver = null;
	
	@BeforeMethod
	public void start(){
		
		driver = new FirefoxDriver();
	}

}
