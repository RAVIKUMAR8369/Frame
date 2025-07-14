package ArrraysProgramme;

import java.util.HashSet;

public class RemoveDupliacteArrayElement {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,4,5,5,6,6};
		
		HashSet<Integer> set=new HashSet<>();
		for(int num:a) {
			set.add(num);
		}
            System.out.println(set);
	}

}
