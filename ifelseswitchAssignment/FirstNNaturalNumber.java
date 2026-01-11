package ifelseswitchAssignment;

import java.util.Scanner;

public class FirstNNaturalNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Natural number lenght : ");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			System.out.print(i+"  ");
		}
		
		sc.close();

	}

}
