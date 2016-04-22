package testBase;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseTest {
	
	public WebDriver driver = null;
	String browser = "ff";

	
	@BeforeMethod
	public void start() throws MalformedURLException{
		

		if(browser.equals("ff")){
			driver = new FirefoxDriver();
		}else {
			
			//DesiredCapabilities capabilities = new DesiredCapabilities().firefox();
			//capabilities.firefox();
			//capabilities.setBrowserName("firefox");
			//capabilities.setPlatform(Platform.WINDOWS);
			//capabilities.setVersion("45.0.1");
			
			driver = new RemoteWebDriver(new URL("http://192.168.1.8:4444/wd/hub"), DesiredCapabilities.firefox());
			
			//URL dh=new URL("http://localhost:4444/wd/hub");
			//DesiredCapabilities dc=new DesiredCapabilities().firefox());
			
			//WebDriver d=new RemoteWebDriver(dh,dc);
			//driver = new FirefoxDriver();
			}
		driver.get("https://www.google.com/");
				

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@AfterMethod
	public void closeBrowser(){
		driver.close();
	}
	

}
