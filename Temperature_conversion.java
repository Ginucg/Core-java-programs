package kvn.com;

import java.util.Scanner;

public class Temperature_conversion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		float cel,far;
		int choice;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("______SELECT THE CHOICE______");
		System.out.println("1.Convert from celcius to fahreneit");
		System.out.println("1.Convert from fahreneit to celcius");
		System.out.println("Enter your choice");
		choice=sc.nextInt();
		
		switch(choice){
		case 1:System.out.println("Find the Fahreneit");
		System.out.println("Enter the celcius that wants to be converted to fahreneit");
		cel= sc.nextFloat();
		far=(cel*9/5)+32;
		System.out.println("Farheneit ="+far);
		break;
		case 2: System.out.println("Find the Celcius");
		System.out.println("Enter the fahreneit that wants to be converted to celcius");
		far= sc.nextFloat();
		cel=(far-32)*5/2;
		System.out.println("Farheneit ="+far);
		break;
		default:
		System.out.println("Invalid Output");
		}
	}
}
