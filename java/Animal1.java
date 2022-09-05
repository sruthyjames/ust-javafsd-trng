package thisprograms;

public class Animal1 {
	public void display() {
		System.out.println("i am an animal");
	}
}
class Dog1 extends Animal1{
	public void dispaly() {
		System.out.println("i am a dog");
	}
	public void printMessage() {
		display();
		super.display();
	}
}

class Main2{
	public static void main(String[]args) {
		Dog dog1=new Dog();
		dog1.printMessage();
	}

}
