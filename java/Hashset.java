package Day5;
import java.util.HashSet;

public class Hashset {
	public static void main(String[]args) {
		HashSet<Integer>evenNumber=new HashSet<>();
		
		evenNumber.add(2);
		evenNumber.add(4);
		evenNumber.add(6);
		System.out.println("Hashset:"+evenNumber);
		
		HashSet<Integer>numbers=new HashSet<>();
		
		numbers.addAll(evenNumber);
		numbers.add(5);
		System.out.println("New Hashset:"+numbers);
	}

}
