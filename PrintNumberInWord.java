
//Print words that equals to the int value
import java.util.Scanner;


public class PrintNumberInWord {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter in a number: ");
		int num;
		num = in.nextInt();
		
		switch (num) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		case 5:
			System.out.println("Five");
			break;
		case 6:
			System.out.println("Six");
			break;
		case 7:
			System.out.println("Seven");
		case 8:
			System.out.println("Eight");
		case 9:
			System.out.println("Nine");
		default:
			System.out.println("Other");
			break;
		} in.close();
	}
}
