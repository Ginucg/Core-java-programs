package looping;

import java.util.Scanner;

public class Find_sum_of_individual_num {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int num,sum=0,digit;
        System.out.println("Enter a number");
        num = sc.nextInt();
        while(num!=0) {
     	   digit=num%10;  
     	   sum = sum+digit;
     	   num=num/10;
        }
        
        	System.out.println("Sum of individual number is "+sum);
	}

}
