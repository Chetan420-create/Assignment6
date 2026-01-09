package ConditionStaementAssingment;

import java.util.Scanner;

public class PositiveNegativeZero {

	public static void main(String[] args) {
		// Positive , Negative , Zero 
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Number : ");
		int number = input.nextInt();
		
		if(number == 0) {
			System.out.println("ZERO = "+number);
		}else if(number > 0) {
			System.out.println("POSITIVE : "+number);
		}else {
			System.out.println("NEGATIVE : "+number);
		}
		
		input.close();
	}
	
	

}
