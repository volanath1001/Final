package actions;

import org.openqa.selenium.WebDriver;

import pages.HomePageElements;
import testBase.BaseTest;

public class HomePageActions extends HomePageElements{

	//BaseTest base = null;
	public HomePageActions(/*WebDriver driver*/) {
		//super(driver);
		//base = new BaseTest();
	}
	
	public void formFill(String fName,String lName,String phone){
		
		/*base.*/fillText(firstName_TB, "Masud");
		/*base.*/fillText(lastName_TB, "Masud_AM");
		/*base.*/fillText(zipCode_TB, "Masud_zip");
		/*base.*/fillText(email_TB, "Masud@Masud.Masud");
		
		
	}
	
}
