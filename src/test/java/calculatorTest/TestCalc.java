package calculatorTest;

import org.junit.Test;

import calculator.Calculator;
import calculator.DivideByZeroException;

import static org.junit.Assert.*;

public class TestCalc {

	@Test
	public void testAdd_valid() {
		assertEquals(Calculator.add(1, 2), 3, 0);
	}
	
	@Test
	public void testSubtract_valid() {
		assertEquals(Calculator.subtract(5, 3), 2, 0);
	}
	
	@Test
	public void testMultiply() {
		assertEquals(Calculator.multiply(2, 4), 8, 0);
	}
	
	@Test
	public void testDivide_validInput() {
		assertEquals(Calculator.divide(6, 3), 2, 0);
	}
	
	@Test(expected=DivideByZeroException.class)
	public void testDivide_byZero() {
		System.out.println(Calculator.divide(5, 0));
		
	}
}
