package programmingpractice;

public class Dog {
	String breed;
	String color;
	int age;

	void barking() {
		System.out.println(color + " colored " + breed + " aged " + age + " is barking ");
	}

	public Dog() {
		breed = "GS";
		color = "Black";
		age = 5;
	}

	public Dog(String a) {
		breed = a;
		color = "silver";
		age = 5;
	}

	public Dog(String a, String b) {
		breed = a;
		color = b;
		age = 5;
	}

	public Dog(String a, String b, int c) {
		breed = a;
		color = b;
		age = c;
	}

	public Dog(String a, int b, String c) {
		breed = a;
		color = c;
		age = b;
	}

	public Dog(String a, int b) {
		breed = a;
		color = "Brown";
		age = b;
	}

	public Dog(int a, String b, String c) {
		breed = b;
		color = c;
		age = a;
	}

	public Dog(int a) {
		breed = "pitbull";
		color = "  patched";
		age = a;
	}
}
