
import java.util.Scanner;

class addition {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two Numbers");

		int a = scan.nextInt();
		int b = scan.nextInt();

		int c = a + b;

		System.out.println("addition result:" + c);
	}
}