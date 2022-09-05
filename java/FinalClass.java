package thisprograms;

public class FinalClass {
	public void display() {
		System.out.println("This is a final method.");
	}
}

class Main35 extends FinalClass{
	public void display() {
		System.out.println("The final method is overridden.");
	}
	
	public static void main(String[]args) {
		Main35 obj=new Main35();
		obj.display();
	}

}
