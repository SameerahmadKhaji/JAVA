
public class ForLoop1 {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
			
			
			if(i==3)
			{
				System.out.println("sam");
				continue;
			}
			 System.out.println("kazi");
			
		}
		
		System.out.println("out of construct");
		
	}
	
	

}
