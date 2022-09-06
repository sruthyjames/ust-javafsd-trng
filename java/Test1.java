package Abstractprograms;

class Test1 {
	int a;
	int b;
	
	Test1()
	{
		a=10;
		b=20;
	}
	Test1 get()
	{
		return this;
	}
	{
		System.out.println("a="+a+"b="+b);
	}
	public static void main(String[]args)
	{
		Test1 object=new Test1();
		object.get().display();
		
	}

}
