package Day4;
import java.io.FileReader;

public class trycatch3 {
	public static void main(String[]args) {
		
		char[]array=new char[100];
		try {
			FileReader input=new FileReader("C:\\Users\\ustjavafsdb223\\newFile.txt");
			
			input.read(array);
			System.out.println("Data in the file:");
			System.out.println(array);
			
			input.close();
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}

}
