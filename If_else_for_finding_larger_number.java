package decrementandincrement;
import java.util.Scanner;
public class If_else_for_finding_larger_number {

	/**
	 * @param args
	 */
	       public static void main(String[] args) {
				int num;
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the number");
				num=sc.nextInt();
				if(num>0) {
					System.out.println(num+" is greater than zero");
				}
				else {
					System.out.println(num+" is less than zero");
				}
				
	}

}
