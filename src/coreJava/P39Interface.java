package coreJava;

interface A39 {
	
	public static final int age = 45;
	public static final String area = "Pune";

	void show();

	void config();

}

interface X39 {
	void run();
}

interface Y39 extends X39{
	
}

class B39 implements A39,Y39 {
	public void show() {
		System.out.println("In Show");
	}

	public void config() {
		System.out.println("In Config");
	}

	public void run() {
		System.out.println("Running");
		
	}

}

public class P39Interface {

	public static void main(String[] args) {

		A39 obj;
		obj = new B39();
		
		obj.show();
		obj.config();
		
		System.out.println(A39.age);
		System.out.println(A39.area);

		Y39 obj1 = new B39();
		obj1.run();
	}

}
