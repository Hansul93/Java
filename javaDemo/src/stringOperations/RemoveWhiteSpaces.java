package stringOperations;

import java.util.Scanner;

public class RemoveWhiteSpaces {
		
		public static void main(String[] args) 
	    { 
	        String str = "Siva Sujatha"; 
	       
	        // Call the replaceAll() method 
	        str = str.replaceAll("\\s", " "); 
	       
	        System.out.println(str); 
	    } 
	} 