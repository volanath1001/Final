package test.f.createAccount;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class B1{
	
	@BeforeClass
	public void bc(){
		System.out.println("@BeforeClass");
	}
	
	@BeforeTest
	public void b(){
		System.out.println("@BeforeTest");
	}
	
	@BeforeMethod
	public void bm(){
		System.out.println("@BeforeMethod");
	}

}
