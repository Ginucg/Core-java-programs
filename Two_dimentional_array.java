package bubble_sort;

import java.util.Scanner;

public class Two_dimentional_array {

	/**
	 * @param args
	 */
             	public static void main(String[] args) {
				
				int a[][]=new int[3][3]; //Two Dimensional Array 
				//datatype identifier[][]=new datatype[rows][cols];
				
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter 3x3 matrix");
				for(int r=0;r<3;r++) {
					for(int c=0;c<3;c++) {
						a[r][c] = sc.nextInt();
					}
				}
				
				System.out.println("Entered Matrix is");
				for(int r=0;r<3;r++) {
					for(int c=0;c<3;c++) {
						System.out.print(a[r][c] +" ");
					}
					
					System.out.println();
				}

			}

		}

