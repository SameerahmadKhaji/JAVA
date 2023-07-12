package marathon;

import java.util.Scanner;

public class DoubleTheNumber {
public static void main(String[] args) {

	
	
	Scanner scan=new Scanner(System.in);
	
	int num=scan.nextInt();
	scan.close();
	System.out.println(doubleTheNumber( num));
	
}


public static int doubleTheNumber(int num) {
	
	
	return 2*num;
}


}
