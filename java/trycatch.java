package Day4;

public class trycatch {
	public static void main(String[]args) {
		try {
			
			int divideByzero=5/0;
			System.out.println("Rest of code in try block");
		}
		
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException=>"+e.getMessage());
		}
	}

}
