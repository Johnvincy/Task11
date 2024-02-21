package Task11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Filereaderexp {

	public static void main(String[] args) {
		
		        try {
		            // Specify the path to the file
		            String filePath = "example.txt";

		            // Create a File object
		            File file = new File(filePath);

		            // Check if the file exists
		            if (!file.exists()) {
		                throw new FileNotFoundException("File '" + filePath + "' not found.");
		            }

		            // Create a Scanner object to read from the file
		            Scanner scanner = new Scanner(file);

		            // Read and display each line from the file
		            while (scanner.hasNextLine()) {
		                String line = scanner.nextLine();
		                System.out.println(line);
		            }

		            // Close the scanner
		            scanner.close();
		        } catch (FileNotFoundException e) {
		            // Catch the FileNotFoundException and display error message
		            System.out.println("Error: " + e.getMessage());
		        }
		    }
		}
