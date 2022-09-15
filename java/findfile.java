package Day4;
import java.io.*;

public class findfile {
	public static void findfile()throws IOException {
		
		File newFile=new File("test.txt");
		FileInputStream stream=new FileInputStream(newFile);
	}
	public static void main(String[]args) {
		try {
			findfile();
		}
		catch(IOException e) {
			System.out.println(e);
		}
		
		}
	}


