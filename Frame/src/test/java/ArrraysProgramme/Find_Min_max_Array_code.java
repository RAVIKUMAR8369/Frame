package ArrraysProgramme;

public class Find_Min_max_Array_code {

	public static void main(String[] args) {
		int a[]= {20,30,40,60,90,100,120};
		
		int max=a[0];
		int min=a[0];
		
		for(int i=0;i<a.length;i++) {
			//apply condition
			if(max < a[i]) {
				max=a[i];
			}
			if(min >a[i]) {
			   min=a[i];
		}

	}
		System.out.println(max);
		System.out.println(min);

}
}