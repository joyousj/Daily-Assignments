//Print multiplication table 
public class MultiplyImpl implements ICalculator {

	public void compute(String function){
			System.out.println(function);
		   	int[][] tt = new int[9][9];
			
			for (int i = 1; i <= 9; i++) {
		         for (int j = 1; j <= 9; j++) {
		        	tt[i-1][j-1] = i*j;
		            System.out.printf("%3d ", tt[i-1][j-1]);
		         }
		         System.out.println();
		      }
		
	}
}
