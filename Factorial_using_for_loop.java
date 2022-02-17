package looping;

import java.util.Scanner;

public class Factorial_using_for_loop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i,num,fact=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		num = sc.nextInt();
		
		
		for(i=num;i>=1;i=i-1){
			fact = fact*i;
			
		}
		System.out.println("The facorial of the number "+num+" is "+fact);
	}


	}

