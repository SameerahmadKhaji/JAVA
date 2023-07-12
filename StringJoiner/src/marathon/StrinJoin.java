package marathon;



//Elimination of the collection
	import java.util.Scanner;

	public class StrinJoin {
	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		
		String str1=scan.next();
		String str2=scan.next();
	 
		System.out.println(joinStrings(str1,str2));//instead of collecting print result by calling and passing
		scan.close();
		
	}

	public static String joinStrings(String str1, String str2) 

	{
		return str1+str2;//instead of collecting just return the logic
		
	}
	}


