package bubble_sort;

import java.util.Scanner;

public class calculating_current_bill {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int units;
		float fixed_rate=350.00f;
		double amount = 0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the units");
		units=sc.nextInt();

		if(units<100){
		    amount=units*1.50+fixed_rate;
		}
		else if(units>=101 && units<=150){    
		}   
		else if(units>=151 && units<=250){
		   amount=  100*1.50+50*2.00f+(units-150)*2.50f+fixed_rate;
		}
		else{
		       amount=100*1.50+50*2.00f+100*2.50f+(units-250)*4.00f+fixed_rate;
		}

		System.out.println("The current bill is Rs."+amount);

	}

}
