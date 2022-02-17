package looping;

import java.util.Scanner;

public class Neon_number {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num,squarenum,digit,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		num=sc.nextInt();
		squarenum=num*num;
		while(squarenum!=0)
		{
			digit=squarenum%10;
			sum=sum+digit;
			squarenum=squarenum/10;
		}
            if(sum==num){
		    	System.out.println("Neon number");
		    }
            else{
            	System.out.println("Not a Neon number");
            	
            }
	}

}
