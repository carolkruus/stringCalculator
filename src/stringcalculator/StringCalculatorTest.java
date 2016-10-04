package stringcalculator;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {

	@Test
	public void emptyStringReturnsZero() {
		StringCalculator c = new StringCalculator();
		int result = c.add("");

		assertThat(result, is(0));
	}

	@Test
	public void singleNumReturnsItsValue() {
		StringCalculator c = new StringCalculator();
		int result = c.add("3");

		assertThat(result, is(3));
	}

	@Test
	public void multiNumReturnsItsSum() {
		StringCalculator c = new StringCalculator();
		int result = c.add("3,5");

		assertThat(result, is(8));

	}
	
	@Test
	public void severalNumReturnsItsSum() {
		StringCalculator c = new StringCalculator();
		int result = c.add("5,8,0,2");

		assertThat(result, is(15));

	}

}