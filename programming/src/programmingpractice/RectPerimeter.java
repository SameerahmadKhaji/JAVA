package programmingpractice;

import java.util.Scanner;

public class RectPerimeter {

	
	public static void main(String[]args) {
		
		Scanner scan =	new Scanner(System.in); 
		perimeterRect p1=new perimeterRect();
		 
		 System.out.println("Enter length");
		 int a=scan.nextInt();
	
	
		 System.out.println("Enter breadth");
	     int b=scan.nextInt();
	scan.close();
	     p1.perimeter(a,b);
	
	
	}
}
