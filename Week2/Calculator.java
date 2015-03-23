//Demo class
public class Calculator {

	public static void main(String[] args) {
		
		ICalculator m = new MultiplyImpl();
		m.compute("multiply");

	}

}
