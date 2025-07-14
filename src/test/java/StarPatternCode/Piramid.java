package StarPatternCode;

import java.util.Scanner;

public class Piramid {

	public static void main(String[] args) {
	
		 int n=4;
		 
		 for(int i=1;i<=n;i++) {
			 
			 for(int j=n-1;j>0;j--) {  // for space 
				 System.out.println(" ");
			 }
			 
			 for(int k=1;k<=(2*i-1);k++) {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
	    }
	}
