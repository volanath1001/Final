package test.f.createAccount;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DataPro {
	
	/*int a;
	
	@Test(enabled=false)
	public void te(){
		System.out.println("Masud");
	}
	
	@Test(enabled=true)
	public void te1(){
		System.out.println("Masud 1");
		Assert.fail();
	}
	
	@Test(dependsOnMethods="te1",alwaysRun=true)
	public void te2(){
		System.out.println("Masud 2");
	}
	*/
	@Test(alwaysRun = true,dataProvider="Masud")
	public void data(int s1, String s2, String s3, String s4){
		System.out.println("Id = " +s1);
		System.out.println("Name = " +s2);
		System.out.println("Email = " +s3);
		System.out.println("Phone = " +s4);
	}
	
	@DataProvider(name="Masud")
	public Object [][] d(){
		
		Object obj[][] = new Object[3][4];
		// 0 = ID
		// 1 = NAME
		// 2 = EMAIL
		// 3 = PHONE
		
		obj[0][0] = 01;
		obj[0][1] = "Masud";
		obj[0][2] = "masud@masud.masud";
		obj[0][3] = "(646) 675 - 4545";
		
		obj[1][0] = 02;
		obj[1][1] = "Rupon";
		obj[1][2] = "Rupon@Rupon.Rupon";
		obj[1][3] = "(347) 675 - 4545";
		
		obj[2][0] = 03;
		obj[2][1] = "Hamid";
		obj[2][2] = "hamid@hamid.hamid";
		obj[2][3] = "(516) 675 - 4545";
		
		return obj;
		
			
		
	}

}
