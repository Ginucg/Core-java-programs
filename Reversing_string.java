package string;

import java.util.Scanner;

public class Reversing_string {

	/**
	 * @param args
	 */
			public static void main(String[] args) {
				String s=" ",rev=" ";
				
				int i;
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter your name :");
				s = sc.nextLine();
				
				for(i=s.length()-1; i>=0; i--) {
					char ch =  s.charAt(i);
					rev = rev + ch;		
				}
				System.out.println("Reversed string is " +rev);
				

			}

		}
