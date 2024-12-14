package coreJava;

class P20Mobile{
	String brand;
	int price;
	static String name;
	
	public void show() {
		System.out.println(brand + " : " + price + " : " + name);
	}
	
}

public class P20StaticKeyword {

	public static void main(String[] args) {

		P20Mobile obj1 = new P20Mobile();
		obj1.brand = "Apple";
		obj1.price = 1500;
		obj1.name = "SmartPhone";
		
		P20Mobile obj2 = new P20Mobile();
		obj2.brand = "Samsung";
		obj2.price = 1100;
		obj2.name = "SmartPhone";
		
		P20Mobile.name = "phone";
		
		obj1.show();
		obj2.show();
		
	}

}
