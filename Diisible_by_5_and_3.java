package ginu.com;
import java.util.Scanner;
public class Diisible_by_5_and_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		n=sc.nextInt();
		
		if(n%5==0 && n%3==0){
			System.out.println(n+" is divisible by both 5 and 3");
		}
		else if(n%3==0){
			System.out.println(n+" is divisible by only 3");	
		}
		else if(n%5==0){
			System.out.println(n+" is divisible by only 5");
		}
		else {
			System.out.println(n+" is not divisible by both 5 and 3");
		}
		}

	}

