package string;

import java.util.Scanner;

public class Number_of_vowels {

	/**
	 * @param args
	 */
                public static void main(String[] args) {
				String s;
				int c=0;
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the word");
				s = sc.nextLine();
				String s1=s.toLowerCase();
						
				System.out.println("No of characters ="+s.length());
				
				for(int i=0;i<s1.length();i++) {
					char ch=s1.charAt(i);
					if(ch=='a' || ch=='e' || ch=='i'||ch=='o'|| ch=='u') {
						c=c+1;
					}
				}
				System.out.println("No of Vowels="+c);
				
				
				}

		}
