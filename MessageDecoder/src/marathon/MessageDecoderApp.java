package marathon;

import java.util.Scanner;

public class MessageDecoderApp {

	
	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the character");
		char ch=scan.next().charAt(0);
		scan.close();
		MessageDecoder decoder = new MessageDecoder();

		System.out.println(decoder.decodeCharacter(ch));
		
	}
	
	
	
}
