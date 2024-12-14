package coreJava;

class A37 {
	public void show() {
		System.out.println("In A show");
	}
}

public class P37AnonymousInnerClass {

	public static void main(String[] args) {

		A37 obj = new A37() {

			public void show() {
				System.out.println("In New show");
			}

		};
		obj.show();
	}

}
