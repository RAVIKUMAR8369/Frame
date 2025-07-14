package ArrraysProgramme;

public class Missingnumberin_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a[]= {1,2,3,5};
     int n=5;
     
     int expectedsum=n*(n+1)/2;
     int actualsum=0;
     
     for(int num:a) {
    	 actualsum+=num;
     }
     
     int missingnum=expectedsum-actualsum;
     System.out.println(missingnum);
	}

}
