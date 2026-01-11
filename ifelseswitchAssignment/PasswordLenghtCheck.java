package ifelseswitchAssignment;

import java.util.Scanner;

public class PasswordLenghtCheck {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter password : ");
		String password = sc.nextLine();
		
		int l = password.length();
		
		if(l >= 8) {
			System.out.println("Strong password");
		}else {
			System.out.println("Weak password");
		}
		
		sc.close();
		

	}

}
