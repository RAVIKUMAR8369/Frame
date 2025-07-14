package TestNg;

import org.testng.annotations.Test;

public class Annotation {
	
	
	@Test(priority=0)
	public void method() {
		System.out.println("Ravi");
		
	}
	@Test(enabled=true)
	public void method1() {
		System.out.println("Result");
	}
 @Test(invocationCount=3)
	public void method3() {
		System.out.println("count");
	}
	
 
	
}
