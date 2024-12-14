package coreJava;

class A26 {
	public A26() {
		super();
		System.out.println("In A");
	}
	public A26(int n) {
		super();
		System.out.println("In A int");
	}
}

class B26 extends A26 {
	public B26() {
		super();
		System.out.println("In B");
	}
	public B26(int n) {
		this();
		System.out.println("In B int");
	}
}

public class P26ThisAndSuper {

	public static void main(String[] args) {

		B26 obj = new B26(5);

	}

}
