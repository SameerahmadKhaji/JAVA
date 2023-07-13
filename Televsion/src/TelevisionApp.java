import java.util.Scanner;
public class TelevisionApp {

	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		
		       
		System.out.println("Enter brand");
		
		String brand=scan.nextLine();
		
		System.out.println("Enter subscription");
		String subscription=scan.next();
		
		System.out.println("Enter audio");
		String audio=scan.next();
		
		System.out.println("Enter channels");
		int channels=scan.nextInt();
		
		System.out.println("Enter settopbox ");
		String settopbox=scan.next();
		
		System.out.println("Enter  price ");
		int price=scan.nextInt();
		
		System.out.println("Enter screen size");
		int size=scan.nextInt();
		
		System.out.println("Enter resolution");
		int resolution=scan.nextInt();
		
	
		System.out.println("Enter  maxvolume ");
		int maxvolume=scan.nextInt();
		
		System.out.println("Enter no.  hdchannel ");
		int hdchannels=scan.nextInt();
		scan.close();
		
		Television t1=new Television(audio,brand,subscription, settopbox, price, size, resolution,channels, maxvolume,hdchannels);
	
		System.out.println(t1.audio+" "+t1.brand+" "+t1.subscription+" "+ t1.settopbox+" "+t1.price+" "+t1.size+" "+t1.resolution+" "+t1.channels+" "+t1.maxvolume+" "+t1.hdchannels);

	}
	
	
	
}
