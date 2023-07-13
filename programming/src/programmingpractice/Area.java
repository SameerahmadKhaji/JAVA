package programmingpractice;

import java.util.Scanner;

public class Area {

	public static void main(String[]args)
	{
		System.out.println("Enter Length");
		System.out.println("enter width");
		Scanner scan=new Scanner(System.in);
		int l=scan.nextInt();
		int b=scan.nextInt();
		areaRect(l,b);
	}
	
	public static void areaRect(int a,int b) {
		
		System.out.println("the area of rectangle is "+a*b);
	}
}


