package Task11;

import java.util.Scanner;

public class Exceptionhandling {

	public static void main(String[] args) {
		
		
		        Scanner scanner = new Scanner(System.in);

		        try {
		            System.out.print("Enter the first number: ");
		            int num1 = scanner.nextInt();

		            System.out.print("Enter the second number: ");
		            int num2 = scanner.nextInt();

		            // Check if the second number is zero
		            if (num2 == 0) {
		                throw new ArithmeticException("Error: Division by zero is not allowed.");
		            }

		            // Perform division
		            int result = num1 / num2;
		            System.out.println("Result of division: " + result);
		        } catch (ArithmeticException e) {
		            System.out.println(e.getMessage());
		        } catch (Exception e) {
		            System.out.println("An error occurred: " + e.getMessage());
		        } finally {
		            scanner.close(); // Close the scanner to prevent resource leak
		        }
		    }
		}

	
