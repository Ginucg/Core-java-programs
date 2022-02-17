package ginu.com;

import java.util.Scanner;

public class Vowels {

	/**
	 * @param args
	 */
		public static void main(String[] args) {
			char letter;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Letter");
			letter=sc.next().charAt(0);
			
			switch(letter){
			case 'A': System.out.println("It is a Vowel");
		       break;   
			case 'E': System.out.println("It is a Vowel");
			       break;
			case 'I': System.out.println("It is a Vowel");
		       break;  
			case 'O': System.out.println("It is a Vowel");
		       break; 
			case 'U': System.out.println("It is a Vowel");
		       break;
			case 'a': System.out.println("It is a Vowel");
		       break;   
			case 'e': System.out.println("It is a Vowel");
			       break;
			case 'i': System.out.println("It is a Vowel");
		       break;  
			case 'o': System.out.println("It is a Vowel");
		       break; 
			case 'u': System.out.println("It is a Vowel");
		       break;   
		    default:
		    	System.out.println("It is a Consonent");
			}
}
}