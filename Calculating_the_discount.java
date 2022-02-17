package ginu.com;
import java.util.Scanner;
public class Calculating_the_discount {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		float amount,rate;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rate of the item");
		rate =sc.nextFloat();
		if(rate>=1000 && rate<=2000){
			amount=(rate*2)/100; 
		}
		else if(rate>=2001 && rate<=4000){
			amount=(rate*3)/100;		
		}
		else if(rate>=4001 && rate<=6000){
			amount=(rate*4)/100;	
	}
		else{
			amount=(rate*5)/100;
		}
			
			System.out.println("discount is Rs." +amount);
			System.out.println("Amount to be paid is Rs."+(rate-amount));
		}
}