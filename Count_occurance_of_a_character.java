package sub_string;

import java.util.Scanner;

public class Count_occurance_of_a_character {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int c=0;
		String s;
		System.out.println("Enter a string");
		s=sc.nextLine();
		System.out.println("Enter a character to be searched");
		char ch=sc.next().charAt(0);
		
		for(int i=0;i<s.length();i++){
			if(ch==s.charAt(i)){
				c++;
			}
		}
		System.out.println(ch+ " Character is present "+c+" times");

	}

}
