package fynal;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Make_Method {
	static WebDriver driver =new FirefoxDriver();
	
	
	
public static void m(String User,String Pass){

driver.findElement(By.xpath(".//*[@id='Email']")).sendKeys(User);
driver.findElement(By.xpath(".//*[@id='next']")).click();
driver.findElement(By.xpath("//input[@id='Passwd']")).sendKeys(Pass);
driver.findElement(By.xpath(".//*[@id='signIn']")).click();
}


	public static void main(String[] args) {
		
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.gmail.com");
		m("Rahmanmdataur0", "rokeya1976");
		
			
		
		

	}

}
