package ConditionStaementAssingment;

import java.util.Scanner;

public class LoanAprovalSystem {

	public static void main(String[] args) {
		// Loan Approval System
		Scanner input = new Scanner(System.in);
		System.out.println("Enter age : ");
		int age = input.nextInt();
		System.out.println("Enter monthly salary : ");
		double salary = input.nextDouble();
		System.out.println("Enter credit score : ");
		int creditScore = input.nextInt();
		
		if(age > 21 && salary >= 25000) {
			if(creditScore >= 700) {
				System.out.println("Loan Approved");
			}else {
				System.out.println("Loan Rejected");
			}
		}else {
			System.out.println("Loan Rejected");
		}
				
		input.close();

	}

}
