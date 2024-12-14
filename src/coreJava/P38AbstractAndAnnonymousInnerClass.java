package coreJava;

abstract class A38 {
	public abstract void show();
}

public class P38AbstractAndAnnonymousInnerClass {

	public static void main(String[] args) {

		A38 obj = new A38() {

			public void show() {
				System.out.println("In New show");
			}

		};
		obj.show();
	}

}
