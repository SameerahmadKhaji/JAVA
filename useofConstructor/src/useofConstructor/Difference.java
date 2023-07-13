package useofConstructor;

import java.util.Scanner;

public class Difference {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the 1st number");
		int num1=scan.nextInt();
		System.out.println("Enter the 2nd number");
		int num2=scan.nextInt();
		
		scan.close();
		//ifelsestatement
		if(num1>num2) {
			System.out.println("(num1>num2,hence the difference of two numbers "+(num2-num1));
		}
		
		else {
			System.out.println("num2>num1,the difference is "+(num1-num2));
		}
	}
	
}
