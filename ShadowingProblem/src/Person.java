
public class Person {

	// idnamegenderemailidphnumber
	int id;
	String name;
	String gender;
	String emailid;
	long phone;

	// Parameterize constructor where local and ins VAR name same
	// Shortcut: source, generate using fields ,select all, enter
	public Person(int id, String name, String gender, String emailid, long phone) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.emailid = emailid;
		this.phone = phone;
	}

	void eat() {
		System.out.println(name + "is Eating.....");
	}

	void sleep() {
		System.out.println(gender + " " + name + "is Sleeping");
	}

}
