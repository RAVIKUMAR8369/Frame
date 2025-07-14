package ProgrammeJava;

public class Swap_Two_numberUsinthird_variable {

	public static void main(String[] args) {
	   int a=10;
	   int b=20;
	   
	   System.out.println("Before swap" + a + b);
	   int t=a;
	   a=b;
	   b=t;
        
        System.out.println("Before swap" + a + b);
        
        
        //without using third varible
        
        a=a+b;
        b=a-b;
        a=a-b; 
	   
	}

}
