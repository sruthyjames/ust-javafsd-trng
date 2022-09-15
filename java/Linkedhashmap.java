package Day5;
import java.util.LinkedHashMap;

public class Linkedhashmap {
	public static void main(String[]args) {
		java.util.LinkedHashMap<String,Integer>
		evenNumbers=new LinkedHashMap<>();
		evenNumbers.put("Two", 2);
		evenNumbers.put("Four", 4);
		System.out.println("linkedHashMap1:"+evenNumbers);
		
		LinkedHashMap<String,Integer>numbers=new LinkedHashMap<>(evenNumbers);
		numbers.put("Three",3);
		System.out.println("LinkedHashMap2:"+numbers);
	}

}
