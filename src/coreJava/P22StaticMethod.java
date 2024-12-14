package coreJava;

class P22Mobile{
	String brand;
	int price;
	static String name;

	public void show() {
		System.out.println(brand + " : " + price + " : " + name);
	}
	
	public static void show1(P22Mobile obj) {
		System.out.println(obj.brand + " : " + obj.price + " : " + name);
	}

}

public class P22StaticMethod {

	public static void main(String[] args) {
	
		P22Mobile obj1 = new P22Mobile();
		obj1.brand = "Apple";
		obj1.price = 1500;
		obj1.name = "SmartPhone";
		
		P22Mobile obj2 = new P22Mobile();
		obj2.brand = "Samsung";
		obj2.price = 1100;
		obj2.name = "SmartPhone";
		
		P22Mobile.name = "phone";
		
		obj1.show();
		obj2.show();
		
		P22Mobile.show1(obj1);
		
	}

}
