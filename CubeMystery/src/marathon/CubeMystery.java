package marathon;

import java.util.Scanner;

public class CubeMystery {
	
	
	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter num to find cube");
		int num1=scan.nextInt();
		scan.close();
		
		System.out.println(squareNumber(num1));
	}
		
		public static int squareNumber(int num)
		{
			
			return num*num*num;
			
		}
		
		
		
	
	

}
