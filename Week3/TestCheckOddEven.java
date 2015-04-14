import static org.junit.Assert.*;
import org.junit.Test;

//JUnit Test for CheckOddEven Class
public class TestCheckOddEven {

	public boolean isNumber(int num) {
		boolean result = false;
		if(num % 2 == 0) {
			result = true;
			if(num % 2 != 0 && num > 0) {
				result = false;
			}
		}
		return result;



	}
	@Test
	public void testNumber() {
		TestCheckOddEven even = new TestCheckOddEven();
		TestCheckOddEven odd = new TestCheckOddEven();
		assertEquals("4 is an even number", true, even.isNumber(4));
		assertEquals("3 is an odd number", false, odd.isNumber(3));
	}



}
