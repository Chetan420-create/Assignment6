package ConditionStaementAssingment;

import java.util.Scanner;

public class VoterEligibilityCheck {

	public static void main(String[] args) {
		// Voter Eligibility Check
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the age : ");
		int age = input.nextInt();
		
		if(age > 18) {
			System.out.println("Eligible to Vote");
		}else {
			System.out.println("Not Eligible to Vote");
		}
		
		input.close();

	}

}
