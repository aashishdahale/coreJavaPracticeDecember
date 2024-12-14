package coreJava;

class P12Calculator {
	
	int num = 10;
	
	public int add(int n1, int n2) {
		return n1 + n2;
	}
	public double add(double n1, int n2) {
		return n1 + n2;
	}
	public int add(int n1, int n2, int n3) {
		return n1 + n2 + n3;
	}
}

public class P12MethodOverloading {

	public static void main(String[] args) {

		P12Calculator obj1 = new P12Calculator();
		P12Calculator obj2 = new P12Calculator();
		int r1 = obj1.add(10, 20);
		System.out.println(r1);

		int r2 = obj2.add(10, 20, 30);
		System.out.println(r2);

		obj1.num = 11;
		
		System.out.println(obj1.num);
		System.out.println(obj2.num);
		
	}

}
