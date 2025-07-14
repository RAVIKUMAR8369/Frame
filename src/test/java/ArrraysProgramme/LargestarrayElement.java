package ArrraysProgramme;

public class LargestarrayElement {

	public static void main(String[] args) {
		int a[]= {1,5,6,8,9};
		
		int largestA=a[0];
		
		for(int num:a) {
			if(num > largestA) {
				largestA=num;
			}
		}
    System.out.println(largestA);
	}

}
