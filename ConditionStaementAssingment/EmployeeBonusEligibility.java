package ConditionStaementAssingment;

import java.util.Scanner;

public class EmployeeBonusEligibility {

	public static void main(String[] args) {
		// Employee Bonus eligibility
		Scanner input = new Scanner(System.in);
		System.out.print("Enter salary : ");
		int s = input.nextInt();
		input.nextLine();
		System.out.print("Enter Experience : ");
		int ex = input.nextInt();
		
		if(s >=30000 && ex >= 3) {
			System.out.println("Bonus eligible");
		}else {
			System.out.println("Not eligible ");
		}
		input.close();

	}

}
