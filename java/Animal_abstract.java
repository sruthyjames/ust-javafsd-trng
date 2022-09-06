package Abstractprograms;

abstract class Animal_abstract {
	abstract void makeSound();
	public void eat()
	{
		System.out.println("I can eat.");
	}
}

class Dog extends Animal_abstract{
	
	public void makeSound() {
		System.out.println("Bark bark");
	}
}

class Main1{
	public static void main(String[]args) {
		
		Dog d1=new Dog();
		
		d1.makeSound();
		d1.eat();	
	}

}
