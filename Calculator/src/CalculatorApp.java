import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
	
		
		
		
		
		Calculator c1=new Calculator();
		
		
		for(;;)
		{
			 char p='+';
			 char q='-';
			 char r='*';
			 char s='/';
			 char t='%';
			 char u='!';
			 
			 Scanner scan=new Scanner(System.in);
			
			System.out.println("===========Menu=========,Hi user whats up,enter a symbol");
			System.out.println("+   Addition");
			System.out.println("-   Subtraction");
			System.out.println("*   multiplication");
			System.out.println("/   division");
			System.out.println("%   remainder");
			System.out.println("!   stop");
			char f=scan.next().charAt(0);	
			if(f==u)
			{
				
				c1.stop();
				break;
			}
			

			System.out.println("Enter first number");
			double c=scan.nextDouble();
			System.out.println("Enter second number");
			double d=scan.nextDouble();
			
			
			
			
			
			
				
			  if (f == p) {
	                System.out.println(c1.add(c, d));
	            } else if (f == q) {
	                System.out.println(c1.sub(c, d));
	            } else if (f == r) {
	                System.out.println(c1.mul(c, d));
	            } else if (f == s) {
	                System.out.println(c1.div(c, d));
	            } else if (f == t) {
	                System.out.println(c1.rem(c, d));
	            } else {
	                System.out.println("blind");
	            }
			
		}
		
	    
		

	}

}
