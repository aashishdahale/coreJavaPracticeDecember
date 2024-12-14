package coreJava;

class A30{
	public void show() {
		System.out.println("In A show");
	}
	public void config() {
		System.out.println("In A config");
	}
}

class B30 extends A30{
	public void show() {
		System.out.println("In B show");
	}
}

public class P30MethodOverriding {

	public static void main(String[] args) {
		B30 obj = new B30();
		obj.show();
		obj.config();
	}

}
