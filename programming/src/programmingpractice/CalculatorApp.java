package programmingpractice;
//CLASSROOM CODEEE for operators    
import java.util.Scanner;

public class CalculatorApp {
	
	public static void main(String[]args)
	{
		calculator c1=new calculator();
		Scanner scan = new Scanner(System.in);
		
	//invokevalue
	System.out.println("enter first num");
	System.out.println("enter sec number");
	
	int a=scan.nextInt();
	int b=scan.nextInt();

	c1.sum(a,b);
	c1.sub(a,b);
	c1.mul(a,b);
	c1.div(a,b);
	
}}
