package thisprograms;

public class FinalDemo3 {
	public final void display() {
		System.out.println("this is a final mathod.");
	}
}

class Main86 extends FinalDemo{
	public final void display() {
		System.out.println("The final method is overridden.");
	}
	public static void main(String[]args) {
		Main86 obj=new Main86();
		obj.display();
	}

}
