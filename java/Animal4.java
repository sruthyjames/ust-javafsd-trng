package thisprograms;

public class Animal4 {
	Animal4(){
		System.out.println("i am an animal");
	}
	
	Animal4(String type){
		System.out.println("Type:"+type);
	}
}
class Dog4 extends Animal4{
	Dog4(){
		super("Animal4");
		System.out.println("i am a dog");
	}
}

class Main12{
	public static void main(String[]args) {
		Dog4 dog1=new Dog4();
	}

}
