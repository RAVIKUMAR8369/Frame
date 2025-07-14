package ProgrammeJava;


import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpladateFormet {

	public static void main(String[] args) {
        Date d=new Date();
        System.out.println(d);
        
       String s="MMM dd YYYY";
       SimpleDateFormat sd=new SimpleDateFormat(s);
       System.out.println(sd.format(d));
	}

}
