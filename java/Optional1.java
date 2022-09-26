package Java8Eg;
import java.util.Optional;

public class Optional1 {
	public static void main(String[]args) {
		Optional<String>optional=Optional.of("hello");
		
		if(optional.isPresent()) {
			String value=optional.get();
			System.out.println("Optional value:"+value);
		
		
		}else
		{
			System.out.println("Optional has no value");
		}
	}

}
