package Day4;

public class trycatch11 {
	public static void main(String[]args) {
		try {
			int dividebyZero=5/0;
			System.out.println("rest of code in try block");
		}
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException=>"+e.getMessage());
		}
	}

}
