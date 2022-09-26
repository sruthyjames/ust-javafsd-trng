package Java8Eg;
import java.util.ArrayList;

import java.util.List;
import java.lang.*;

public class Main_L4 {

	public static void main(String[]args) {
		List<String>list=new ArrayList<String>();
		list.add("ankit");
		list.add("mayank");
		list.add("irfan");
		list.add("jai");
		
		list.forEach(
				(n)->System.out.println(n)
				
				);
		
		}
}
