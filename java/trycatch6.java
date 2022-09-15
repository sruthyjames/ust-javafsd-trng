package Day4;
import java.io.FileOutputStream;

public class trycatch6 {
	public static void main(String[]args) {
		String data="This is a line of text inside the file";
		
		try {
			FileOutputStream output=new FileOutputStream("output.txt");
			byte[]array=data.getBytes();
			output.close();
		}
		
		catch(Exception e) {
			e.getStackTrace();
		}
		}
	}
