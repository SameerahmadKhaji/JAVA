import java.util.Scanner;

public class PersonApp {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter id");
		int id = scan.nextInt();
		System.out.println("Enter Name");
		scan.nextLine();// to eat the enters which might be printed as character
		String name = scan.nextLine();
		System.out.println("Enter Gender");
		String gender = scan.nextLine();
		System.out.println("Enter Emailid");
		String emailid = scan.nextLine();
		System.out.println("Enter Phone Number");
		long phone = scan.nextLong();
		scan.close();//close the scanner object
		Person p = new Person(id, name, gender, emailid, phone);
		System.out.println(p.id + " " + p.name + " " + p.gender + " " + p.emailid + " " + p.phone);
        
	}
}
