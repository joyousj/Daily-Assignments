//Finding the even numbers sum and average
public class EvenSum implements iSumAvg {

	int upper;
	int lower;
	double sum;
	float average;
	int evenNum;
	
	public EvenSum(int upper, int lower) {
		this.upper = upper;
		this.lower = lower;
		sum = getSum();
		average = getAvg();
		evenNum = 0;
	}
	
	
	public double getSum() {
		for(int x = 2; x <= 100; x++) {
			if(x % 2 != 0) {
				sum += x;
				evenNum += 1;
			}
		}
		return sum;
	}

	public float getAvg() {
		average = (float) (sum / evenNum);
		return average;
	}
	
	public void printNum() {
		System.out.println("The sum of even numbers is: " + sum);
		System.out.println("The average of even numbers is: " + average);
		
	}
	
}
