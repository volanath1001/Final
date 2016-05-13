package in;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class AA {
	
	public AA(int a,int b) {
		WebDriver driver = new HtmlUnitDriver();
		int x = a+b;
		System.out.println(" In Con  "+x);
	}
	
	public int add(int a,int b) {
		int x = a+b;
		System.out.println(" In add  "+x);
		return x;
	}

}
