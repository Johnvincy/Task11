package Task11;

public class Arrayindexoutofboundexp {

	public static void main(String[] args) {
	
		        int[] array = {1, 2, 3, 4, 5};

		        try {
		            // Trying to access an index outside the bounds of the array
		            int value = array[10];
		            System.out.println("Value at index 10: " + value);
		        } catch (ArrayIndexOutOfBoundsException e) {
		            System.out.println("Array index out of bounds!");
		        }
		    }
}
