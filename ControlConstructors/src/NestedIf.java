
public class NestedIf {
	
	    public static void main(String[] args) {
	        int x = 10;
	        int y = 5;
	        int z = 3;

	        if (x > y) {
	            System.out.println("Condition 1 is true.");

	            if (y > z) {
	                System.out.println("Condition 2 is true.");

	                if (x > z) {
	                    System.out.println("Condition 3 is true.");
	                    System.out.println("All conditions are satisfied!");
	                }
	            }
	        }
	    }
	}



