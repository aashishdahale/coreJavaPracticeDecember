package coreJava;

class P21Mobile{
	String brand;
	int price;
	static String name;


	public P21Mobile() {	
		brand = "";
		price = 200;
		System.out.println("In the Constructor");
	
	}

	static {
		name = "Phone";
		System.out.println("In static block");
	}

	public void show() {
		System.out.println(brand + " : " + price + " : " + name);
	}

}

public class P21StaticBlock {

	public static void main(String[] args) throws ClassNotFoundException {
		
		P21Mobile obj1 = new P21Mobile();
		obj1.brand = "Apple";
		obj1.price = 1500;
		P21Mobile.name = "SmartPhone";

		P21Mobile obj2 = new P21Mobile();
		
	}

}


