//Finding the sum and average from 1-100
public class SumAndAverage {

	public static void main(String args[]){

		double sum = 0;
		double average = 0;

		for(int i = 1; i <= 100; i++){
			sum += i;
			average = sum/100;
		} System.out.println("The sum is " + sum);
		System.out.println("The average is " + average);

	} 
}
