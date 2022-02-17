package looping;

import java.util.Scanner;

public class Factors_of_given_num {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		num=sc.nextInt();
		System.out.println("factors of number "+num+" are" );
		for(i=1;i<=num;i++){
			if(num%i==0){
				System.out.println(i);
			}
		}

	}

}
