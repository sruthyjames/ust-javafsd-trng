package Abstractprograms;

abstract class language {
	public void display() {
		System.out.println("This is java Programming");
	}
}

class Main extends language{
	public static void main(String[]args) {
		
		Main obj=new Main();
		
		obj.display();
	}
}

		
	



