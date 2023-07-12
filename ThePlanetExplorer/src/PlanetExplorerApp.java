import java.util.Scanner;

public class PlanetExplorerApp {
	

	public static void main(String[] args) {
	
		PlanetExplorer explorer = new PlanetExplorer();
             Scanner scan=new Scanner(System.in);
           System.out.println("Enter radius");
           double radius=scan.nextDouble();
           scan.close();
           
           
System.out.printf("%.2f",explorer.calculateSurfaceArea(radius));
		
		

	}
	
}
