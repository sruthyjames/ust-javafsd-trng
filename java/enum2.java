package Day4Set3;
enum Size1{
	SMALL,MEDIUM,LARGE,EXTRALARGE
}

class enum2 {
	Size1 pizzaSize;
	public enum2(Size1 pizzaSize) {
		this.pizzaSize=pizzaSize;
	}
	public void orderPizza() {
		switch(pizzaSize) {
		case SMALL:
			System.out.println("I ordered a small size pizza.");
			break;
		case MEDIUM:
			System.out.println("I ordered medium size pizza.");
			break;
			default:
				System.out.println("I don't know which one to order.");
				break;
		}
	}
}
class Main1{
	public static void main(String[]args) {
		enum2 t1=new enum2(Size1.MEDIUM);
		t1.orderPizza();
		}
	}


