package java_array;

import java.util.Scanner;

public class Minimum_array_element {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a[]=new int[5]; 
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the array elements "+a.length);
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		int min=a[0];
		for(int i=0;i<a.length;i++){
			if(a[i]<min){
				min=a[i];
			}
		}
		System.out.println("Smallest number is "+min);
		
	int max=a[0];
	for(int i=0;i<a.length;i++){
		if(a[i]>max){
			max=a[i];
		}
	}
	System.out.println("Smallest number is "+max);
	}
}
