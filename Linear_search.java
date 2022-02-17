package java_array;

import java.util.Scanner;

public class Linear_search {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int size,search,pos=0;
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
			pos=i+1;
			break;
			}
		}
	    if(pos>0){

	    	System.out.println("Succesful search");
	    	System.out.println("The element "+search+" found at position "+pos);
	    	 }
	    else{
	    	System.out.println("The element "+search+" not found");
	    	System.out.println("Unsuccesful search");
	    }
	}
}
