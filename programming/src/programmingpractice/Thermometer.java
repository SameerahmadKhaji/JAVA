package programmingpractice;

import java.util.Scanner;

public class Thermometer {

	public static void main(String[]args)
	{
	
		thermometer1 t1=new thermometer1();//object creation
	Scanner scan= new Scanner(System.in);
	
	System.out.println("just tell me how mch fahrnheit...ill convert");
	double f=scan.nextDouble();
	scan.close();
	t1.fmula(f);
	
	
	
}}

