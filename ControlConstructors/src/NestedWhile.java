
public class NestedWhile {

	    public static void main(String[] args) {
	        int outerCounter = 1;

	        while (outerCounter <= 3)
	        {
	            int innerCounter = 1;

	            while (innerCounter <= outerCounter) {
	                System.out.print(outerCounter);
	                innerCounter++;
	            }

	            System.out.println();
	            outerCounter++;
	        }
	    }
	}
