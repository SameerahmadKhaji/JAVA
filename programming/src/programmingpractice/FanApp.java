package programmingpractice;
//withoutconstructor
public class FanApp {
	
	public static void main(String[]args) {
	       Fan f1=new Fan();
	       
	       f1.brand="Usha";
	       f1.color="Red";
	       f1.cost=3000;
	       
	        f1.rotate();
	        f1.blows_Air();
	        new Fan().rotate();
	      
	}
}
