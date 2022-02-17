package string;

import java.util.Scanner;

public class User_credentials {

	/**
	 * @param args
	 */
	        public static void main(String[] args) {
			String uname,upass;
			Scanner sc=new Scanner(System.in);
			int i;
			System.out.println("You have maximum 3 attempts to login");
			System.out.println("Your account will be locked");
			System.out.println("You can try after 24 hrs");
			for(i=1;i<=3;i++) {
				System.out.println("Enter your name");
				uname=sc.next();
				System.out.println("Enter your password");
				upass=sc.next();
			
			if(uname.equals("admin") && upass.equals("admin123")){
				System.out.println("Login successfull");
				break;
		       }
			else {
				System.out.println("Invalid username or password ");
				System.out.println(i+" attempts are over");
				
			  }
			} //for
			if(i==4) {
				System.out.println("Sorry your account is locked you can try after 24 hrs");
			}
		}
	}
