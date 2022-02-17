package decrementandincrement;
import java.util.Scanner;
public class StudentInformation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int i;
		float fee;
		String n;
		char gen;
		System.out.println("Enter Students name");
		n=sc.nextLine();
		System.out.println("Enter Students age");
		i=sc.nextInt();
		System.out.println("Enter Students fees");
		fee=sc.nextFloat();
		System.out.println("Enter Students gender");
	    gen=sc.next().charAt(0);
	    
	    System.out.println("Student name is "+n);
	    System.out.println("Student age is "+i);
	    System.out.println("Student fee is "+fee);
	    System.out.println("Student gender is "+gen);
	}

}
