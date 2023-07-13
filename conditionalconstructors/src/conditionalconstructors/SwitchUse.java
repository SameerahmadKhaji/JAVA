package conditionalconstructors;

import java.util.Scanner;

public class SwitchUse {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter + or - or * or / to know about the operator");
		int opt = scan.next().charAt(0);
		scan.close();

		switch (opt) {
		case '+':
			System.out.println("add ition operator");
			break;
		case '-':
			System.out.println("Subtraction operator");
			break;
		case '*':
			System.out.println("Multiplication operator");
			break;
		case '/':

			System.out.println("Division operator");
			break;
		default:
			System.out.println("See the message properly");
		}
//8 minutes
	}
}