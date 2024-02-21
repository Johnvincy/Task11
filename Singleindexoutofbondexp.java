package Task11;

public class Singleindexoutofbondexp extends RuntimeException {
		    public Singleindexoutofbondexp(String message) {
		        super(message);
		    }

		    public static void main(String[] args) {
		        try {
		            int[] arr = {1, 2, 3, 4, 5};
		            int index = 6; // Index that is out of bounds
		            
		            // Check if the index is valid
		            if (index < 0 || index >= arr.length) {
		                throw new Singleindexoutofbondexp("Index " + index + " is out of bounds!");
		            }

		            // Accessing the value at the specified index
		            int value = arr[index];
		            System.out.println("Value at index " + index + ": " + value);
		        } catch (Singleindexoutofbondexp e) {
		            System.out.println("SingleIndexOutOfBoundsException: " + e.getMessage());
		        }
		    }
		}


	
