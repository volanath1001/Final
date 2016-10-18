package fynal;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class A {
	public static int x = 0;

	static WebDriver d=new FirefoxDriver();
public static void m(){
	
	d.get("http://www.bn.com");
	new Actions(d).sendKeys(Keys.ENTER).perform();;
	WebElement link=d.findElement(By.xpath(".//*[@id='topNav8']/a"));
	String expected=link.getAttribute("href");
	
	link.click();
	String actual = d.getCurrentUrl();
	//expected.equals(actual);
	System.out.println(expected.equals(actual));
	//actual.equals(expected);
	
	//Assert.assertEquals(actual, expected);
	
	
	System.out.println(actual.equals(expected));

}
public static void main(String[] args) {
	m();
}

}
