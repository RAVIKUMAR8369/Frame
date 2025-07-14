package ArrraysProgramme;

import java.util.Arrays;

public class MaegeTwoArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int b[]= {6,7,8,9};
		
		int merged[]=new int[a.length+b.length];
		System.arraycopy(a, 0, merged, 0, a.length);
        System.arraycopy(b, 0, merged, a.length, b.length);
        System.out.println(Arrays.toString(merged));
	}

}
