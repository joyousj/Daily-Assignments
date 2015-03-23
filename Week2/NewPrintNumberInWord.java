//Print words that equals to the int value
//Switch case statements
import java.util.Scanner;


public class NewPrintNumberInWord implements NumAndWord {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter in a number: ");
		int num;
		num = in.nextInt();
		NewPrintNumberInWord pniw = new NewPrintNumberInWord();
		String number = pniw.convertNum(num);
		pniw.printNum(number);
		in.close();
			}

	@Override
	public String convertNum(int num) {
		String word = "";
		
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
			break;
		case 8:
			System.out.println("Eight");
			break;
		case 9:
			System.out.println("Nine");
			break;
		default:
			System.out.println("Other");
			break;
		}

		return word;
	}

	@Override
	public void printNum(String num) {
		System.out.println(num);
		
	}
}
