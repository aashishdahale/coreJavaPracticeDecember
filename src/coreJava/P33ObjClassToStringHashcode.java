package coreJava;

import java.util.Objects;

class Laptop33 {
	String model;
	int price;

	
	@Override
	public String toString() {
		return "Laptop33 [model=" + model + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(model, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop33 other = (Laptop33) obj;
		return Objects.equals(model, other.model) && price == other.price;
	}

	
}

public class P33ObjClassToStringHashcode {

	public static void main(String[] args) {

		Laptop33 obj1 = new Laptop33();
		obj1.model = "Lenovo";
		obj1.price = 1000;

		Laptop33 obj2 = new Laptop33();
		obj2.model = "Lenovo";
		obj2.price = 1000;

//		boolean result = obj1 == obj2;
		boolean result = obj1.equals(obj2);

		System.out.println(obj1);
		System.out.println(obj2);

		System.out.println(result);
	}
}
