package pack1.com;

import java.util.Scanner;

public class Parseint_ex4 {


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a number as a string: ");
	        String str = scanner.nextLine();

	        try {
	            int num = Integer.parseInt(str);
	            System.out.println("Parsed integer: " + num);
	        } catch (NumberFormatException e) {
	            System.out.println("Error: Unable to parse the string as an integer.");
	        } finally {
	            scanner.close();
	        }
	    }
	}
