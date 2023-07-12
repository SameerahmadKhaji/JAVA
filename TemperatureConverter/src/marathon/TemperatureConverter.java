package marathon;

public class TemperatureConverter {
    double Fahren;
    
    
    public double convertFahrenheitToCelsius(double fahrenheit)
    {
    	
    	return (fahrenheit - 32) * 5/9;
    }
}
