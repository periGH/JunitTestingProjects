package com.platform.project.myTest;

import org.junit.Assert;
import org.junit.Test;

import com.platform.project.application.Calculator;

public class CalculatorTest {

	Calculator calculator = new Calculator();

	@Test
	public void happyAddition() {
		System.out.println("Starting happyAddition Test");
		double result = calculator.calculate(2, 3, '+');
		Assert.assertTrue(result == 5.0);
	}

	@Test
	public void minBoundary() {
		System.out.println("Starting minBoundary Test");
		try {
			double result = calculator.calculate(-Double.MAX_VALUE, -1, '+');
			System.out.println("UNEXPECTED: result is equal to: " + result); //
			Assert.assertTrue(false);
			Assert.fail(); 

		} catch (ArithmeticException ae) {
			ae.printStackTrace();
		}
		System.out.println("Exception caught for out of boundary addition.");
		Assert.assertTrue(true);
	}

	@Test
	public void testDivision() {
		System.out.println("Starting division Test");
		double result = calculator.calculate(120, 2, '/');
		Assert.assertTrue(result == 60.0);
	}

	@Test
	public void divisinByZero() {
		System.out.println("Starting divisionByZero Test");

		try {

			double result = calculator.calculate(1.0, 0, '/');
			System.out.println("UNEXPECTED: result is equal to: " + result);
			Assert.fail();

		} catch (IllegalArgumentException iae) {
			iae.printStackTrace();
			System.out.println("Exception caught for out of division by zero");
			Assert.assertTrue(true);
		}
	}

	@Test
	public void testSubtract() {
		System.out.println("Starting subtract test");
		double result = calculator.calculate(10, 2.5, '-');
		Assert.assertTrue(result == 7.5);

	}

}
