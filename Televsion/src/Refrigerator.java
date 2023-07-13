
public class Refrigerator {
	
	


String brand;
String type;
String stabilizer;
String numofrows;

int price;
int size;
int temperature;
int dials;
int maxCool;
int maxfreez;


void cools()
{
	System.out.println("cools items");
}
	
void maintainstemp()
{
	System.out.println("maintains the temperature");
}
public Refrigerator(String brand,String type,String stabilizer,String numofrows,int price,int size,int temperature,int dials,int maxCool,int maxfreez)                           
{
	this.brand= brand;
	this.type= type;
	this.stabilizer= stabilizer;
	this.numofrows= numofrows;
	
	this.price= price;
	this.size=size;
	this.temperature=temperature;
	this.dials=dials;
	this.maxCool=maxCool;
	this.maxfreez= maxfreez;
	
}
	
}


	
	
	
	
	
	


