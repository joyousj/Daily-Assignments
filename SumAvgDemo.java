//Demo class for sum and average 
public class SumAvgDemo {

	public static void main(String[] args) {
		SumAndAverage nSum = new SumAndAverage(5, 10);
		OddSum nOdd = new OddSum(5, 10);
		EvenSum eSum = new EvenSum(5, 10);
		
		verifySumAvg(nSum);
		verifySumAvg(nOdd);
		verifySumAvg(eSum);
	}
	
	public static void verifySumAvg(iSumAvg sumAvg) {
		sumAvg.printNum();
	}
}
