package v;

public class V_b {
	
	
	
	public static void main(String[] args) {
		V_a va = new V_a();

		System.out.println("============  1  ===============");
		System.out.println("s >"+V_a.s);
		System.out.println("f >"+va.r);
		
		
		System.out.println("============  2  ===============");
		V_a.s = 20;
		va.r =25;
		
		System.out.println("s >"+V_a.s);
		System.out.println("f >"+va.r);
		
		System.out.println("===========  3  ================");
		V_a va1 = new V_a();
		
		
		System.out.println("s >"+V_a.s);
		System.out.println("f >"+va1.r);
		
		System.out.println("f >"+va.r);

		
		
		
		
	}

}
