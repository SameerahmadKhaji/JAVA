package marathon;

import java.util.Scanner;

public class TemperatureConverterApp {
	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter temp in fahrenheit");
		double f=scan.nextDouble();
		scan.close();
	
	TemperatureConverter temperatureConverter = new TemperatureConverter();
	
	System.out.println(temperatureConverter.convertFahrenheitToCelsius(f));
	
}
}