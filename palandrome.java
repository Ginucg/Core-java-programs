package looping;

import java.util.Scanner;

public class palandrome {

	/**
	 * @param args
	 */
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
	           int num, digit, rev=0;
	           System.out.println("Enter a number");
	           num = sc.nextInt();
	         
	           while(num!=0) {
	        	   digit=num%10;  
	        	   rev = rev*10+digit;//3,    3*10+2=32   32*10+1=321
	        	   
	               num=num/10;  
	           }
	          System.out.println("Reversed Number is "+rev);
	           
	       }

	}
