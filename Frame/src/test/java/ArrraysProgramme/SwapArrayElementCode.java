package ArrraysProgramme;

import java.util.Arrays;

public class SwapArrayElementCode {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		Swap(a,2,3);

	}
	public static void Swap(int a[],int index1,int index2) {
		System.out.println(Arrays.toString(a));
		int t=a[index1];
		a[index1]=a[index2];
		a[index2]=t;
		System.out.println(Arrays.toString(a));
		
	}

}
