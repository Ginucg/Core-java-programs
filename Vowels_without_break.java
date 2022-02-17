package ginu.com;

import java.util.Scanner;

public class Vowels_without_break {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char letter;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Letter");
		letter=sc.next().charAt(0);
		
		switch(letter){
		case 'A':          
		case 'E': 	    
		case 'I':        
		case 'O':        
		case 'U':        
		case 'a':          
		case 'e': 	       
		case 'i':        
		case 'o':        
		case 'u': System.out.println("It is a Vowel");
		break;
		
	    default:
	    	System.out.println("It is a Consonent");
		}
	}

}
