package ginu.com;
import java.util.Scanner;
public class Average_marks {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int s1,s2,s3,s4,s5;
		float avg;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first subject marks");
		s1 = sc.nextInt();
		System.out.println("Enter the second subject marks");
		s2 = sc.nextInt();
		System.out.println("Enter the third subject marks");
		s3 = sc.nextInt();
		System.out.println("Enter the fourth subject marks");
		s4 = sc.nextInt();
		System.out.println("Enter the fifth subject marks");
		s5 = sc.nextInt();
		
		avg =(float)(s1+s2+s3+s4+s5)/5;
		System.out.println("Average marks="+avg);





	}

}
