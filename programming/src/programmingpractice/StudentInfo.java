package programmingpractice;

import java.util.Scanner;

public class StudentInfo {

	public static void main(String[]args)
	{
		
		student i1=new student();
		
		Scanner scan=new Scanner(System.in);
	    
		System.out.println("Enter ur name");
	    String name=scan.nextLine();

		System.out.println("Enter ur surname");
	    String surname=scan.nextLine();
	    
	    System.out.println("Enter ur Age");
        int age=scan.nextInt();
	  
		
	  
		i1.info(name,age,surname);
		
		
	}
	
}
