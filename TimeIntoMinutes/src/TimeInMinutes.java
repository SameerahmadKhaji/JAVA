import java.util.Scanner;

public class TimeInMinutes {
	
	public static void main(String[] args) {
		
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter in minutes");
		double minutes=scan.nextDouble();
		scan.close();
		convertToHours(minutes);
		System.out.println(convertToHours(minutes));
		
		
		
	}


	
	public static double convertToHours(double minutes)
	{
		
		return minutes/60.0;
		
	}

}