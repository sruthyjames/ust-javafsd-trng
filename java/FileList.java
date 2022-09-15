package Day4;
import java.io.File;

 class FileList {
	public static void main(String[]args) {
		
		File file=new File("C:\\Users\\ustjavafsdb223");
		
		String[]fileList=file.list();
		
		for(String str:fileList) {
			System.out.println(str);		}
	}

}
