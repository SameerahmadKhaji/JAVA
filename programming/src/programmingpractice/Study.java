package programmingpractice;

import java.util.Scanner;

public class Study {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many pages did you study?");
        int page = scan.nextInt();

        while (page > 1) {
        	System.out.println("Are you bored?");
            String a = scan.next();

            if (a.equals("yes")) {
                System.out.println("You are bored."+"u read "+page+" pages");
                break;
            } else 
            
            {
                System.out.println("User read " + page + " pages.");
         
            }
            
            System.out.println("continue study? yes/no");
            
            String con=scan.next();
            
            if(con.equals("no"))
            {
              
            	System.out.println("enter the no. of additional pages studied");
            
                 int more=scan.nextInt();
                 page+=more;
            }
            
        }
    }
}
