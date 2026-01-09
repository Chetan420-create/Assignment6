package ConditionStaementAssingment;

import java.util.Scanner;

public class ElectricityBillCategory {

	public static void main(String[] args) {
		// electricity bill category
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the unit : ");
		int units = input.nextInt();
		
		if(units <= 100) {
			System.out.println("LOW USAGE");
		}else if(units > 100){
			if(units > 300) {
				System.out.println("HIGH USAGE");
			}else {
				System.out.println("MEDIUM USAGE");
			}
			
			
		}
		input.close();

	}

}
