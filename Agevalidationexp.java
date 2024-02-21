package Task11;

import java.util.Scanner;

public class Agevalidationexp {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        try {
	            System.out.print("Enter your age: ");
	            int age = scanner.nextInt();

	            if (age < 18) {
	                throw new InvalidAgeException("Age must be 18 or older.");
	            }

	            System.out.println("Age entered: " + age);
	        } catch (InvalidAgeException e) {
	            System.out.println("Error: " + e.getMessage());
	        } finally {
	            scanner.close();
	        }
	    }

	    // Custom exception class for invalid age scenario
	    static class InvalidAgeException extends Exception {
	        public InvalidAgeException(String message) {
	            super(message);
	        }
	    }
	}


