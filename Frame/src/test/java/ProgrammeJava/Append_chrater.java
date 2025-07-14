package ProgrammeJava;

public class Append_chrater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String input = "aaabbbcccddd";
	        String output = "";

	        for (int i = 0; i < input.length(); i++) {
	            char ch = input.charAt(i);
	            if (output.indexOf(ch) == -1) {
	                output += ch;
	            }
	        }

	        System.out.println("Output: " + output);
	    }
	}
	


