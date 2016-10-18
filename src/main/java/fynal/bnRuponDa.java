package fynal;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class bnRuponDa {
	@Test
	public void bntest() throws InterruptedException{
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.get("http://www.barnesandnoble.com/");
		driver.findElement(By.xpath("html/body/div[3]/div/div/div/section/header/a")).click();
		WebElement SB=driver.findElement(By.id("searchBarBN"));
		SB.sendKeys("A History of Bangladesh: Politics, Economic and Civil Society");
		Thread.sleep(2000);
		WebElement cl=driver.findElement(By.id("searchSubmit"));
		cl.click();
		System.out.println(driver.getTitle().contains("A History of Bangladesh"));
		driver.findElement(By.xpath("(//span[@class='styled-radio'])[3]")).click();
		driver.findElement(By.xpath(".//*[@id='skuSelection']/input")).click();
		Thread.sleep(2000);
	
		driver.findElement(By.xpath(".//*[@id='viewShoppingBag']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='btn-orange sign-in-checkout']")).click();
		Thread.sleep(2000);
	
		driver.switchTo().frame(driver.findElement(By.xpath("(//iframe)[5]")));
		Thread.sleep(2000);
	     
		driver.findElement(By.id("email")).sendKeys("rup@yahoo.com");
		driver.findElement(By.id("guestCheckoutBtn")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	  WebElement country=  driver.findElement(By.xpath(".//*[@class='selectBox-arrow']"));
	  country.click();
	 // java.util.
	  List<WebElement>list=new ArrayList<>();
	  
	list=driver.findElements(By.xpath("(.//*[@id='country-option-list']/li/a)"));
	for(int i=0;i<list.size();i++){
	
	
	
	
	String text=list.get(i).getText();
	System.out.println("looking for Bangladesh but found  - "+ text);
	if(text.contains("Bangladesh")){
		System.out.println("Got it");
		list.get(i).click();
		break;
	}
	
	//System.out.println("Clicked links-----"+i);
	
	}
	driver.findElement(By.id("firstName")).sendKeys("Rup");
		
	driver.findElement(By.id("lastName")).sendKeys("Nat");
	
	driver.findElement(By.id("phoneNumber")).sendKeys("34766609461");
	
	driver.findElement(By.id("streetAddress")).sendKeys("30-49,72nd street");
	
	driver.findElement(By.id("city")).sendKeys("East Elmhurst");
	/*  driver.findElement(By.xpath(".//*[@id='state-replacement']/span[2]")).click();
	java.util.List<WebElement> list1=driver.findElements(By.xpath("//ul[@id='state-option-list']/li/a"));
	for(int i=0;i<=list1.size();i++){
		if(list1.get(i).getText().equals("Bangladesh")){
			list1.get(i).click();
		}
	}*/
	driver.findElement(By.id("state")).sendKeys("New york");
	driver.findElement(By.id("zipCode")).sendKeys("11370");
	driver.findElement(By.xpath(".//*[@id='continue']")).click();
	Thread.sleep(3000);
	WebElement radio=driver.findElement(By.xpath("(//span[@class='styled-radio'])[3]/../input"));
	radio.click(); 
	Thread.sleep(3000);      
	WebElement radio1=driver.findElement(By.xpath("(//span[@class='styled-radio'])[3]/../input"));
	
	Boolean delops=radio1.isSelected();
	System.out.println("this is standard delivery....."+delops);
	driver.findElement(By.xpath(".//*[@id='continue']")).click();
	Boolean use_Address=driver.findElement(By.xpath("//span[@class='styled-checkbox']")).isSelected();
	System.out.println("shipping add"+use_Address);

	//new Actions(driver).dragAndDrop(source, target);
	
	
	
}

}
