package coreJava;

//Dynamic Method Dispach

class A31{
	public void show() {
		System.out.println("In A show");
	}
}
class B31 extends A31{
	public void show() {
		System.out.println("In B show");
	}
}
class C31 extends B31{
	public void show() {
		System.out.println("In C show");
	}
}

public class P31Polymorphism {

	public static void main(String[] args) {

		A31 obj = new A31();
		obj.show();
		
		obj = new B31();
		obj.show();
		
		obj = new C31();
		obj.show();
	}

}
