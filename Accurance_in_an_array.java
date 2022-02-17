package java_array;

import java.util.Scanner;

public class Accurance_in_an_array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int size,search,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter "+size+" elements");
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the element to be searched");
		search=sc.nextInt();
		for(int i=0;i<size;i++){

		if(search==a[i]){
		    count=count+1;
}
}
		if(count==0){
			System.out.println(search+" not found");
		}
		else{
			System.out.println(search+" found "+count+" times in the array" );
		}
	}
}
