package java_array;

import java.util.Scanner;

public class User_input_array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a[]=new int[5]; //can use float,double
		int i;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the array elements "+a.length);
		for(i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		System.out.println("Array elements are");
		for(i=0;i<a.length;i++){
			System.out.println(a[i]);
		}

	}

}
