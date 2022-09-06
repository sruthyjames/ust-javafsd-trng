package Abstractprograms;

interface Language1 {
	void getName(String name);
}
class ProgrammingLanguage implements Language1
{
public void getName(String name) {
	System.out.println("Programming Language:"+name);
}
}
class Main4{
	public static void main(String[]args) {
		ProgrammingLanguage language=new ProgrammingLanguage();
		language.getName("Java");
	}

}
