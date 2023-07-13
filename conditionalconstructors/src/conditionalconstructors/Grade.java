package conditionalconstructors;

import java.util.*;

public class Grade {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Your marks");

		int marks = scan.nextInt();
		scan.close();
		if (marks < 50)
		{
			System.out.println("D grade");
			System.out.println("Congratulations");

		} else if (marks >= 50 && marks < 60) {
			System.out.println("C grade");
			System.out.println("Congratulations");
		}

		else if (marks >= 60 && marks < 70) {
			System.out.println("B grade");
			System.out.println("Congratulations!!");
		} else if (marks >= 70 && marks < 80) {
			System.out.println("A grade");
			System.out.println("Congratulations!!");
		}

		else {
			System.out.println("A+ grade");
			System.out.println("Congratulations!!");
		}

	}

}
