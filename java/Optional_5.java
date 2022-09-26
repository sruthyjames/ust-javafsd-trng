package Java8Eg;
import java.util.Optional;

public class Optional_5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Optional<String>emptyOption=Optional.empty();
		Optional<String>StrOption=Optional.of("one");
		System.out.println(emptyOption.orElseGet(()->"optional null or ElseGet"));

		System.out.println(emptyOption.orElseGet(()->"optional value or ElseGet"));
		
	

	}

}


