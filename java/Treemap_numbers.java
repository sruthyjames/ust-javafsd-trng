package Day5;
import java.util.TreeMap;


public class Treemap_numbers {
	public static void main(String[]args) {
		TreeMap<String, Integer>evenNumbers=new TreeMap<>();
		
		evenNumbers.put("Two", 2);
		evenNumbers.put("Four", 4);
		
		evenNumbers.putIfAbsent("Six",6);
		System.out.println("TreeMap of even numbers:"+evenNumbers);
		TreeMap<String,Integer>numbers=new TreeMap<>();
		numbers.put("One", 1);
		
		numbers.putAll(evenNumbers);
		System.out.println("treeMap of numbers:"+numbers);
	}

}
