import java.util.Scanner;

public class Nestedifelse {
	
	    public static void main(String[] args) {
	       Scanner scan= new Scanner(System.in);
	       
             int number=scan.nextInt();
            
             scan.close();
             
             
	        if (number > 0) {
	            System.out.println("Number is positive.");

	            if (number % 2 == 0) 
	            {
	                System.out.println("Number is even.");
	            } else {
	                System.out.println("Number is odd.");
	            }
	        } else 
	        {
	            System.out.println("Number is non-positive.");
	        }
	    }
	}


