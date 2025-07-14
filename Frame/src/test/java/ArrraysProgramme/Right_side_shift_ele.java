package ArrraysProgramme;

import java.util.Arrays;

public class Right_side_shift_ele {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		
		int last=a[a.length-1];
		int size=a.length;
		
		for(int i=size-1;i>0;i--) {
			a[i]=a[i-1];
		}
		
		a[0]=last;
        System.out.println(Arrays.toString(a));
	}

}
