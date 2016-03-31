package testBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	
	WebDriver driver = null;
	
	@BeforeMethod
	public void start(){
		
		driver = new FirefoxDriver();
		
		driver.get("");
		System.out.println("Practice n Learning");
/////jhgjhgjhgjhgjhgjhgjhgjhgjhg
	
		System.out.println("Hamid Bhai");
		System.out.println("Take a look now");
		System.out.println("Practice n Learning by Rupon");
		
		System.out.println("HYYYYYYYYYYYY");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

}
