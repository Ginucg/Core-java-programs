package looping;

import java.util.Scanner;

public class Factorial_of_a_num_for_user_input {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i,num,fact=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		num = sc.nextInt();
		
		i=num;
		while(i>=1){
			fact = fact*i;
			i=i-1;
		}
		System.out.println("The facorial of the number "+num+" is "+fact);
	}

}
