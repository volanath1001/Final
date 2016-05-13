package in;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BB {
	
	//static AA a = new AA(10, 3);
	
	public static void main(String[] args) {
		
		//a.add(4,5);
		//a.add(40,50);
		//System.out.println("sdtk4qj");
		WebDriver driver = new HtmlUnitDriver();
		
		driver.get("http://www.google.com");
		String s = driver.getTitle();
		s.equals("google");
		System.out.println(s);

	}
	@Test
	public void t() throws InterruptedException{
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.bn.com");
		driver.findElement(By.id("signInLink")).click();
		
		Thread.sleep(3000);
		
		List<WebElement> f = driver.findElements(By.xpath("//iframe"));
		
		int i =0;
		for(WebElement e : f){
			System.out.println(i +". "+e.getAttribute("src"));
			i++;
		}
		Thread.sleep(5000);

		driver.switchTo().frame(driver.findElement(By.xpath("//div[@data-modal-name='login']/iframe ")));
		//driver.switchTo().frame(4);
		driver.findElement(By.id("password")).sendKeys("Masud");

		WebElement e = driver.findElement(By.name("/atg/userprofiling/ProfileFormHandler.value.login"));
		e.sendKeys("Masud");
		e.submit();
		
		Thread.sleep(5000);
		driver.close();
	}

}
