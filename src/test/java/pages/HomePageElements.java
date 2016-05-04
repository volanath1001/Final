package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseTest;

public class HomePageElements extends BaseTest{
	
	//WebDriver driver = null;
	public HomePageElements(/*WebDriver driver*/) {
		//this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	@FindBy(name="FN")
	public WebElement firstName_TB;
	
	@FindBy(name="LN")
	public WebElement lastName_TB;
	
	@FindBy(id="ZI")
	public WebElement zipCode_TB;
	
	@FindBy(id="EM")
	public WebElement email_TB;
	
}
