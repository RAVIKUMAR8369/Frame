package ProgrammeJava;

public class Revese_String_Code {

	public static void main(String[] args) {
		String s="Sandeep";
		String rev="";
		int l=s.length();
		
		for(int i=l-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		
		
		
		
		/*Codetwo
		 String s="Hello";
		   
		   String rev=new StringBuilder(s).reverse().toString();
		   
		   System.out.println(rev);*/
	}

}
