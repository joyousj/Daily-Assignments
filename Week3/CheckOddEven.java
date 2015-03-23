//Check if number is even, odd, or a negative number
import java.util.Scanner;

public class CheckOddEven {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int i;
		i = in.nextInt();
		
		if ( i % 2 == 0) {
			System.out.println("The number you've enter is a even number!");
		}
		else if ( i % 2 != 0 && i > 0) {
			System.out.println("The number you've entered is a odd number!");
		}
		else {
			System.out.print("The number you've entered is a negative integer! ");
		}
	}
}
