package thisprograms;

/**
 * The type Animal.
 */
public class Animal {
	/**
	 * Display.
	 */
	public void display() {
	System.out.println("i am an animal");
}
}

/**
 * The type Dog.
 */
class Dog extends Animal{
	public void display() {
		System.out.println("i am a dog");
	}

	/**
	 * Print message.
	 */
	public void printMessage() {
		display();
	}
}

/**
 * The type Main 3.
 */
class Main3{
	/**
	 * Main.
	 *
	 * @param args the args
	 */
	public static void main(String[]args) {
		Dog dog1=new Dog();
		dog1.printMessage();
		
}

}
