package coreJava;

@Deprecated
class A43 {
	public void show() {
		System.out.println("In A show");
	}
}

class B43 extends A43 {
	@Override
	public void show() {
		System.out.println("In B show");
	}
}

public class P43Annotations {

	public static void main(String[] args) {

		B43 obj = new B43();
		obj.show();

	}

}
