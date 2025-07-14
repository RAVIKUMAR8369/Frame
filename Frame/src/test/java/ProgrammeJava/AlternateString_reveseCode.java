package ProgrammeJava;

import java.util.Arrays;
import java.util.HashSet;

import groovyjarjarantlr4.v4.parse.BlockSetTransformer.setAlt_return;

public class AlternateString_reveseCode {

	public static void main(String[] args) {
		 String input ="my name is Ravi";
		  System.out.println(method(input)); 
			 
		 
		 
		
		}
		public static String method(String str) {
			String [] words=str.split(" ");
			
			for(int i=2;i<words.length;i+=2) {
				words[i]=new StringBuilder(words[i]).reverse().toString();
			}
			
			return String.join("  ", words);
		}
}
