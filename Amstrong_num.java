package looping;

import java.util.Scanner;

public class Amstrong_num {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int num, num1, sum=0,digit;
        System.out.println("Enter a number");
        num = sc.nextInt();
        num1=num;
        while(num!=0) {
     	   digit=num%10;  
     	   sum = sum+digit*digit*digit;
     	   num=num/10;
        }
        if (sum==num1){
        	System.out.println(num+" is an armstrong number");
        }
        else {
        	System.out.println(num+" is not an armstrong number");
        }
        	
        }

	}

