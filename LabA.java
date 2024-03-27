package number_pattern_practice9jan;
import java.util.Scanner;
public class LabA {

	public static void main(String[] args) 
	{
		
		Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Simple Calculator");
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter the operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result = 0;

        try {
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        throw new ArithmeticException("Cannot divide by zero!");
                    }
                    result = num1 / num2;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid operator!");
                    
            }

            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("An unexpected error occurred!");
            e.printStackTrace();
        } finally {
            scanner.close();
        }

	}

}






