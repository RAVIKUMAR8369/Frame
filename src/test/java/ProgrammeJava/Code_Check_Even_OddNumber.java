package ProgrammeJava;

import java.util.Scanner;

public class Code_Check_Even_OddNumber {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number :");
		int num=scanner.nextInt();
		
		if(num%2==0) {
			System.out.println("Even number");
		}else {
			System.out.println("Odd number");
		}

	}

}
