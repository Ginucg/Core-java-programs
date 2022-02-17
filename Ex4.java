package decrementandincrement;
import java.util.Scanner;
public class Ex4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int i;
		float fval;
		double d;
		String n;
		//char gen;
		//gen=sc.next().charAt(0);
		System.out.println("Enter your name");
		n=sc.nextLine();//with space  
		//only one word n=sc.next();
		System.out.println("Enter integer value");
		i=sc.nextInt(); //read the integer value
		System.out.println("Enter float value");
		fval=sc.nextFloat(); //read the float value
		System.out.println("Enter double value");
		d=sc.nextDouble(); //read the float value
		
		System.out.println("integer i="+i);
		System.out.println("float val="+fval);
		System.out.println("double value="+d);
		System.out.println("Name="+n);
		}
}
