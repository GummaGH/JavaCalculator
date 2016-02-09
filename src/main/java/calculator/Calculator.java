package calculator;

public class Calculator {

    private Calculator(){

    }

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

        if(new Double(number2).equals(0.0)) {
            throw new DivideByZeroException();
        }

        return number1 / number2;
    }

}
