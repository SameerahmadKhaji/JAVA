package programmingpractice;

import java.util.Scanner;

public class Calculatotrrrr {
	
	public static void main(String[]args) {
	System.out.println("Enter two numbers");
Scanner scan=new Scanner(System.in);
double a=scan.nextDouble();
double b=scan.nextDouble();
add(a,b);
sub(a,b);
mul(a,b);
div(a,b);



	}

public static void add(double a,double b)
{
	 System.out.println("the sum is "+(a+b));
}
public static void sub(double a,double b)
{
	 System.out.println("the subtraction result is "+(a-b));
}
public static void mul(double a,double b)
{
	 System.out.println("the product is "+(a*b));
}
public static void div(double a,double b)
{
	 System.out.println("the quotient is "+(a/b));
}

}