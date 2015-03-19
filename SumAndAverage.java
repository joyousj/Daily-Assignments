//Finding the sum and average from 1-100

public class SumAndAverage implements iSumAvg {

		int upper;
		int lower;
		double sum;
		float average;

	public SumAndAverage(int upper, int lower) {
		this.upper = upper;
		this.lower = lower;
		sum = getSum();
		average = getAvg();
	}
		
	

	@Override
	public double getSum() {
	
		for(int x = 1; x <= 100; x++){
			 sum += x;
		} return sum;
	}

	@Override
	public float getAvg() {
		average = (float) (sum / ((100 - 1) + 1));
		return average;
	} 

	@Override
	public void printNum() {
	
		System.out.println("The sum is: " + sum);
		System.out.println("The average is: " + average);
		
	}

}
