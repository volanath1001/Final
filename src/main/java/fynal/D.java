package fynal;

import org.testng.Assert;
import org.testng.annotations.Test;
import r.Retry;


public class D {
	
	public static void main(String[] args) {
		
		String s = System.getProperty("user.dir");
		String expected = "C:\\Users\\Islam\\workspace\\Final";
		
		System.out.println("Actual ["+ s+"]");
		System.out.println("Expected ["+ expected+"]");
		
		
		Assert.assertEquals(s, expected);
	}
	
	@Test(retryAnalyzer=Retry.class)
	public void t(){
		System.out.println("t");
		Assert.assertEquals("sw", "s");
	}
	@Test(retryAnalyzer=Retry.class)
	public void t2() throws Throwable{
		
		System.out.println("t2");
        
		// create new exception as well as test fails
		throw new Exception("I am creating Exception");
		//Assert.assertEquals("s", "d");
		//int i = 3/0;

	}

}
