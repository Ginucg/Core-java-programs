package p1;

import java.util.Scanner;

public class Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num,digit,rev=0;
		
		Scanner  sc= new Scanner(System.in);
		System.out.println("enter a number");
		num=sc.nextInt();
		System.out.println("before revnu num= +num");
		int	num1=num;

		while(num!=0){
		digit=num%10;
		num=num/10;
		rev=rev*10+digit;
		}
		System.out.println("the reverse num is"+rev);
		if(rev==num1){
			System.out.println("palindrome");
			
		}else{
			System.out.println("not palindrome");

			
		}
	
		
		
			
		}
		

	}


