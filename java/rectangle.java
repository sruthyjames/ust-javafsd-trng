package Abstractprograms;
interface polygon{
	void getArea(int length,int breadth);
}

public class rectangle implements polygon {
	
	public void getArea(int length,int breadth) {
		System.out.println("The area of the rectangle is "+(length*breadth));
	}
}

class Main3{
	public static void main(String[]args) {
		rectangle r1=new rectangle();
		r1.getArea(5, 6);
	}

}
