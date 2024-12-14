package coreJava;

//final - variable, Method, class

class Calc32{
	public final void show() {
		System.out.println("By Ash");
	}
	public void add(int a, int b) {
		System.out.println(a+b);
	}
}

class AdvCalc32 extends Calc32{
//	public void show() {
//		System.out.println("By John");
//	}
}

public class P32FinalKeyword {

	public static void main(String[] args) {

		AdvCalc32 obj = new AdvCalc32();
		obj.show();
		obj.add(4, 5);

	}

}
