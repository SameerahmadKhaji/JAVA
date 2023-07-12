import java.util.Scanner;

public class FinanceCalculatorApp {

	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter p t r");
		
		double p=scan.nextDouble();
		double t=scan.nextDouble();
		double r=scan.nextDouble();
		
		
		scan.close();
		
		System.out.println();
		FinanceCalculator calculator = new FinanceCalculator();

		

System.out.printf("%.2f",calculator.calculateSimpleInterest(p,t,r));
		
		

	}

}
