package thisprograms;

public class Animal3 {
	Animal3(){
		System.out.println("i am an animal");
	}
}

class Dog3 extends Animal3{
	Dog3(){
		super();
		System.out.println("i am a dog");
	}
}

class Main4{
	public static void main(String[]args) {
		Dog3 dog1=new Dog3();
		
	}

}
