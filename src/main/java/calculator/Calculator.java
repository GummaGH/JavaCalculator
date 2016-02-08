package calculator;

import calculatorTest.DivideByZeroException;

public class Calculator {
	public static double add(double number1, double number2) {
		return number1 + number2;
	}
	
	public static double subtract(double number1, double number2) {
		return number1 - number2;
	}
	
	public static double multiply(double number1, double number2) {
		return number1 * number2;
	}
	
	public static double divide(double number1, double number2) {
				
		if(number1 == 0 || number2 == 0) {
			throw new DivideByZeroException();
		}
		
		return number1 / number2;
	}

}
