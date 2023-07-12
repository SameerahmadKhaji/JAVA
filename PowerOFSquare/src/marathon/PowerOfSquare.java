package marathon;

import java.util.Scanner;

public class PowerOfSquare {
	
	
	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter num to find square");
		int num=scan.nextInt();
		scan.close();
		
		System.out.println(squareNumber(num));
	}
		
		public static int squareNumber(int num)
		{
			
			return num*num;
			
		}
		
		
		
	
	

}
