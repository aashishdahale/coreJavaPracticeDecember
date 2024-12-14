package coreJava;

public class P10ObjectAndClass {

	public static void main(String[] args) {

		//Object - properties and Behaviours

		int num1 = 4;
		int num2 = 5;

//		int result = num1 + num2;

		P10Calculator calc = new P10Calculator();
		int result = calc.add(num1,num2);
		System.out.println(result);
	}

}

class P10Calculator{
	
	int a;
	
	public int add(int n1, int n2) {
		int r = n1 + n2;
		return r;
	}
}








