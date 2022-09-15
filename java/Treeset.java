package Day5;
import java.util.TreeSet;
import java.util.Iterator;

public class Treeset {
	public static void main(String[]args) {
		TreeSet<Integer>numbers=new TreeSet<>();
		numbers.add(5);
		numbers.add(5);
		numbers.add(6);
		System.out.println("TreeSet:"+numbers);
		
		Iterator<Integer>iterate=numbers.iterator();
		System.out.print("TreeSet using iterator:");
		
	while(iterate.hasNext())
		System.out.println(iterate.next());
	System.out.print(",");
	}

}

