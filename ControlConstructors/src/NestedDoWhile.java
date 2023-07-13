
public class NestedDoWhile {
	
	    public static void main(String[] args) {
	        int outerCounter = 1;

	        do {
	            int innerCounter = 1;

	            do {
	               System.out.println("Outer loop: " + outerCounter);
	               System.out.println("Inner loop: " + innerCounter);
	                innerCounter++;
	            } while (innerCounter <= 3);

	            outerCounter++;
	        } while(outerCounter <= 2);
	    }
	    
	}


