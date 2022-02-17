package decrementandincrement;
import java.util.Scanner;
public class Area_of_Square {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int s,area;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter are side length");
		s=sc.nextInt();
		
		area=s*s;
		
		System.out.println("The area of square with side "+s+" is "+area);
		

	}

}
