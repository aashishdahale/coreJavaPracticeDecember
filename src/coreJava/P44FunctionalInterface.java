package coreJava;

@FunctionalInterface
interface A44{
	
	void show();
	
}



public class P44FunctionalInterface {

	public static void main(String[] args) {

		A44 obj = new A44() {
			public void show() {
				System.out.println("In Show");
			}
		};

		obj.show();
	}

}
