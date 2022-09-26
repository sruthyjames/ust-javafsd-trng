package Java8Eg;


public class Methodreference_2 {
	public static void ThreadStatus() {
		System.out.println("thread is running");
		
	}
	public static void main(String[] args) {
		Thread t2=new Thread(Methodreference2:: ThreadStatus);
		t2.start();
		
	}
	

}


