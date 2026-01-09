package ConditionStaementAssingment;

import java.util.Scanner;

public class BalanceCheck {

	public static void main(String[] args) {
		// Minimum Balance Check
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your balance amount : ");
		double balance = input.nextDouble();
		if(balance >= 1000) {
			System.out.println("Balance Ok");
		}else {
			System.out.println("LOW BALANCE..");
		}
		input.close();
	}

}
