package v;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;


public class Sn {
	WebDriver driver = new FirefoxDriver();
	
	@Test
	public void t() throws IOException{
		
		driver.get("http://www.americanexpress.com");
		
		//File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(file);
		// String screenshotBase64 = ((screenshotFile)driver).getScreenshotAs(base64);
		 
		 
		 File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\Islam\\Desktop\\SN\\masud.png"));
	}

}
