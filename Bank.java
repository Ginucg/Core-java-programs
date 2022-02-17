package kvn.com;

import java.util.Scanner;

public class Bank {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int choice;
		float amount=10000,da,wa;
		char ch;
		Scanner sc=new Scanner(System.in);
		do{
		
		System.out.println("*****ENTER THE CHOICE*****");
		System.out.println("1.Deposit Amount");
		System.out.println("2.Withdraw Amount");
		System.out.println("3.Display the Account Balance Account");
		
		System.out.println("please enter your choice");
		choice= sc.nextInt();
		
		switch(choice){
		case 1:
			System.out.println("Deposit");
			System.out.println("Enter the amount to be deposited");
			da =sc.nextFloat();
			if(da>0){
			amount=amount+da;
			System.out.println("balance amount="+amount);
			} 
			else{
				System.out.println("Deposit amount should not be negative");
			}
			break;
		case 2:
			System.out.println("Withdraw");
			System.out.println("Enter the amount to be withdrawn");
			wa =sc.nextFloat();
			if (wa<amount){
				amount=amount-wa;
				System.out.println("balance amount="+amount);
			}
			else {
				System.out.println("Insufficient Balance");
			}
			break;
		case 3:
			System.out.println("Your Account Balance is "+amount);
			break;
		default:
			System.out.println("Invalid Input");
			}
		System.out.println("Do you want to continue Yes/No");
		ch =sc.next().charAt(0);
					}
					while(ch!='N');
					System.out.println("____Thank You for using Banking services____");
	}

}
