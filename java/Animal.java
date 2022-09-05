package thisprograms;

public class Animal {
public void display() {
	System.out.println("i am an animal");
}
}

class Dog extends Animal{
	public void display() {
		System.out.println("i am a dog");
	}
	
	public void printMessage() {
		display();
	}
}

class Main3{
	public static void main(String[]args) {
		Dog dog1=new Dog();
		dog1.printMessage();
		
}

}
