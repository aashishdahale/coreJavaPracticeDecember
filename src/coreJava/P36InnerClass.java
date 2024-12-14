package coreJava;

class A36{
	int age;
	public void show() {
		System.out.println("In show");
	}
//	class B36{
	static class B36{
		public void config() {
			System.out.println("In config");
		}
	}
}

public class P36InnerClass {

	public static void main(String[] args) {
		
		A36 obj = new A36();
		obj.show();
		
//		A36.B36 obj1 = obj.new B36();
		A36.B36 obj1 = new A36.B36();
		obj1.config();
	}

}
