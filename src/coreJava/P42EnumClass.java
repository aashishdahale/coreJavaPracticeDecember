package coreJava;

enum Laptop42 {
	Macbook(2000), XPS(2200), Surface, Thinkpad(1800);

	private int price;

	private Laptop42() {
		price = 500;
	}

	private Laptop42(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}

public class P42EnumClass {

	public static void main(String[] args) {

//		Laptop42 lap = Laptop42.XPS;
//		System.out.println(lap+" "+lap.getPrice());

		for(Laptop42 lap : Laptop42.values()) {
			System.out.println(lap+" "+lap.getPrice());
		}
		
	}

}
