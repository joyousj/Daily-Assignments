//Factorial of 10

import java.util.Scanner;
public class Product1ToN {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int product = 1;
		int n = 10;
		n = in.nextInt();
		
		for(int i = 1; i <= n; i++) {
			product = product * i;
		}
		System.out.println("The factorial is: " + product);
		
	}
}
