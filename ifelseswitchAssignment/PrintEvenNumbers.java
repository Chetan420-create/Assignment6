package ifelseswitchAssignment;

import java.util.Scanner;

public class PrintEvenNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = sc.nextInt();
		
		for(int i = 1;i<=num;i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
		sc.close();
	}

}
