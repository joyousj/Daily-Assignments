//Finding the odd numbers sum and average
public class OddSum implements iSumAvg {

	int upper;
	int lower;
	double sum;
	float average;
	int oddNum;

	public OddSum(int upper, int lower) {
		this.upper = upper;
		this.lower = lower;
		sum = getSum();
		average = getAvg();
		oddNum = 0;
	}

	public double getSum() {
		for(int x = 1; x <= 99; x++) {
			if(x % 2 != 0)
				sum += x;
			oddNum += 1;
		}
		return sum;
	}
	
	public float getAvg() {
		average = (float) (sum / oddNum);
		return average;
	}
	
	public void printNum() {
		System.out.println("The sum of odd numbers is: " + sum);
		System.out.println("The average of odd numbers is: " + average);

	}


}
