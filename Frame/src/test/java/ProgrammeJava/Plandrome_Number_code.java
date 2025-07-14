package ProgrammeJava;

import java.util.Scanner;

public class Plandrome_Number_code {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number:-");
		int num=scanner.nextInt();
		int orgnum=num;
		int rev=0;
		
		while(num!=0) {
			rev=rev*10 + num%10;
			num=num/10;
			
		}
		if(orgnum==rev) {
			System.out.println("Paindrome number");
		}else {
			System.out.println("Not palindrome number");
		}

	}

}
