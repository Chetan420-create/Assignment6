package ifelseswitchAssignment;

import java.util.Scanner;

public class OfficeEntryEligibility {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter arrival time : ");
		double arrives = sc.nextDouble();
		if(arrives <= 9) {
			System.out.println("ALLOWED");
		}else {
			System.out.println("LATE ENTRY");
		}
		sc.close();

	}

}
