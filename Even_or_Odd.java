package ginu.com;
import java.util.Scanner;
public class Even_or_Odd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		num=sc.nextInt();
		
		if(num==0){
			System.out.println(num+" is neither even nor odd");
		}
		else if(num%2==0) {
			System.out.println(num+" is Even");
		}
		else {
			System.out.println(num+" is Odd");
		}

	}

}
