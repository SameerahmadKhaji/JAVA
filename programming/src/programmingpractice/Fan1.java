package programmingpractice;

public class Fan1{

	String brand;
	String color;
	int cost;
	
	void rotate()
	{
		System.out.println(brand+" "+color+" Fan Which costs "+cost+ " fan rotates");
	}
	void blows_Air() 
	{
		
		System.out.println(brand+" fan blows air");
	}
	
	//ConstructorOverloading
	public Fan1( String a,String b,int c )
	{
		brand=a;
		color=b;
		cost=c;
	
	}
	public Fan1( String a,int b,String c )
	{
		brand=a;
		color=c;
		cost=b;
	
	}
} 


