package Java8Eg;
@FunctionalInterface
interface sayable{
	void say(String msg);
	
	int hashCode();
	String toString();
	boolean equals(Object obj);
}
public class FunctionalInterfaceExample2 implements sayable{
	public void say(String msg) {
		System.out.println(msg);
	}
	public static void main(String[]args) {
		FunctionalInterfaceExample2 file=new FunctionalInterfaceExample2();
		file.say("Hello there");
	}

}
