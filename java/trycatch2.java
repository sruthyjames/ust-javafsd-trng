package Day4;
import java.io.File;

public class trycatch2 {
	public static void main(String[]args) {
		
		File file=new File("C:\\Users\\ustjavafsdb223\\newFile.txt");
		
		try {
			boolean value=file.createNewFile();
			if(value) {
				System.out.println("The new file is created.");
			}
			else {
				System.out.println("The file already exists.");
			}
		}
		catch(Exception e) {
			e.getStackTrace();
			}
		}
	}


