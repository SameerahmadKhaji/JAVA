	import java.util.Scanner;
public class RefrigeratorApp {


		public static void main(String[] args) 
		{
			
			
			Scanner scan=new Scanner(System.in);
			
			       
			System.out.println("Enter brand");
			
			String brand=scan.nextLine();
			
			System.out.println("Enter type;");
			String type=scan.next();
			
			System.out.println("Enter stabilizer");
			String stabilizer=scan.next();
			
			System.out.println("Enter numofrows");
			int numofrows=scan.nextInt();
			
			System.out.println("Enter price ");
			String price=scan.next();
			
			
			
			System.out.println("Enter size");
			int size=scan.nextInt();
			
			System.out.println("Enter temperature");
			int temperature=scan.nextInt();
			
		
			System.out.println("Enter dials ");
			int dials=scan.nextInt();
			
			System.out.println("Enter maxCool ");
			int  maxCool=scan.nextInt();
			
			System.out.println("Enter maxfreez ");
			int  maxfreez=scan.nextInt();
			scan.close();
			
			Refrigerator t1=new Refrigerator(brand,type, stabilizer,price, numofrows,size, temperature,dials,  maxCool,maxfreez);
		
			System.out.println(t1.brand+" "+" "+" "+t1.price+" "+t1.size+" "+t1.temperature+" "+t1.dials+ " "+t1.maxCool+" "+t1.maxfreez);

		}}	

