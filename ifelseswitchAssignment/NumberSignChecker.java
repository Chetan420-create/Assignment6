package ifelseswitchAssignment;

import java.util.Scanner;

public class NumberSignChecker {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Nuumber : ");
		int number = sc.nextInt();
		
		if(number == 0) {
			System.out.println("ZERO");
		}else if(number < 0) {
			System.out.println("NEGATIVE");
		}else {
			System.out.println("POSITIVE");
		}
		
		sc.close();
	}

}
