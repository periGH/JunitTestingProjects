package numericalTest;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 * @author Perihan Hill
 * @since 02/14/2020 
 * This program has JUnit Parameterized Test with using
 *  "@Parameters", "@RunWith", "@Test", "@Before" annotations.
 * Create assert statements with assertEquals() method to check 
 *  if summary of two numbers are equal to expected result. 
 * Parameterized test, to execute the same test over and over again.
 */

@RunWith(Parameterized.class)
public class NumericalTest {
	private int number1;
	private int number2;
	private int result;
	private Numerical numerical;

	public NumericalTest(int number1, int number2, int result) {
		super();
		this.number1 = number1;
		this.number2 = number2;
		this.result = result;
	}

	@Before
	public void initialize() {
		numerical = new Numerical();
	}

	@Parameterized.Parameters
	public static Collection input() {
		return Arrays.asList(
				new Object[][] { { 1, 3, 4 }, { 33, 55, 88 }, { 1090, 9876, 10966 }, { 9, 8, 17 }, { -70, 144, 74 } });
	}

	@Test
	public void testNumericalTest() {
		System.out.println("Sum of Numbers = " + result);
		assertEquals(result, numerical.sumOfNumbers(number1, number2));
	}
}
