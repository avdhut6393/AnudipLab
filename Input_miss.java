package pack1.com;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Input_miss {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        try {
	            System.out.print("Please enter an integer: ");
	            int num = scanner.nextInt();
	            System.out.println("You entered: " + num);
	        } catch (InputMismatchException e) {
	            System.out.println("Invalid input. Please enter an integer.");
	            e.printStackTrace();
	        } finally {
	            scanner.close();
	        }
	    }
	}

