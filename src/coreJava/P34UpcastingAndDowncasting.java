package coreJava;

class A34{
	public void show1() {
		System.out.println("In A Show");
	}
}
class B34 extends A34{
	public void show2() {
		System.out.println("In B Show");
	}
}

public class P34UpcastingAndDowncasting {

	public static void main(String[] args) {
	
		A34 obj = new B34();
		obj.show1();
		
		B34 obj1 = (B34) obj;
		obj1.show2();
	}

}
