package programmingpractice;

public class DogApp {
	
	public static void main(String[]args) {
		

    Dog d=new Dog();
    d.barking();
	
	Dog d1=new Dog("Lab");
	d1.barking();
	
	Dog d2=new Dog(" donut","light brown");
	d2.barking();
	
	Dog d3=new Dog("husky","snow white",9);
	d3.barking();
	
	Dog d4=new Dog("bull",3,"red");
	d4.barking();
	
	Dog d5=new Dog("fox",4);
	d5.barking();
	
	Dog d6=new Dog(3,"gs","dark brown");
	d6.barking();
	
	Dog d7=new Dog(10);
	d7.barking();
	
	}
	
}
