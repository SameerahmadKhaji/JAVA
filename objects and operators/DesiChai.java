package practice;

public class DesiChai {

public static void getTea()
{
	System.out.println("The Tea Price is 10 rs");
}
public static void getTea(int quantity)
{
	System.out.println("The price of Tea is Rs"+" "+10*quantity);
}	
public static void getTea(String type)
{
	System.out.println("The price of"+" "+type+ " Tea is 15 rs");
}	
	
public static void getTea(String type,int quantity)
{
   System.out.println("The price of"+" "+quantity+" " +type+" "+"Tea is Rs"+" "+quantity*15);	
}	
	
	
public static void main(String[]args)
{
  getTea();
  getTea(5);
  getTea("Lemon");
  getTea("Ginger",5);
}	
	
}
