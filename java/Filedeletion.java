package Day4;
import java.io.File;

public class Filedeletion {
	public static void main(String[]args) {
		
		File file=new File("C:\\Users\\ustjavafsdb223\\newfile.txt");
		
		boolean value=file.delete();
		if(value) {
			System.out.println("The file is deleted.");
		}
		else {
			System.out.println("The File is not deleted.");
		}
	}

}
