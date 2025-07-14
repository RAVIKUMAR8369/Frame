package ArrraysProgramme;

import java.util.Arrays;

public class Left_side_Array_shift_oneEle_code {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		
		int n=3;       //kitne time element shift krna hi 3 times 
		for(int j=0;j<n;j++) {  //Add the loop to run 3 time
			
		int first=a[0]; //one Element shift karna k y loop hata denge
		int size=a.length;
		
		for(int i=0;i<size-1;i++) {
			a[i]=a[i+1];
		}
		
		a[size-1]=first;
		System.out.println(Arrays.toString(a));

	}
	}
}
