package Task11;

import java.util.Scanner;

public class Loginsystemexp {
	
	private static final String CORRECT_PASSWORD = "password123"; // Assume the correct passwor

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        try {
		            System.out.print("Enter your password: ");
		            String enteredPassword = scanner.nextLine();

		            if (!enteredPassword.equals(CORRECT_PASSWORD)) {
		                throw new IncorrectPasswordException("Incorrect password entered!");
		            }

		            // Proceed with login if password is correct
		            System.out.println("Login successful!");
		        } catch (IncorrectPasswordException e) {
		            System.out.println("Error: " + e.getMessage());
		        } finally {
		            scanner.close(); // Close the scanner to prevent resource leak
		        }
		    }

		    // Custom exception class for incorrect password scenario
		    static class IncorrectPasswordException extends Exception {
		        public IncorrectPasswordException(String message) {
		            super(message);
		        }
		    }
		}


	
