package Threads;


class AT1{
	public void show() {
		for(int i = 1;i <= 10; i++){
		System.out.println("Hi");
		}
	}
}

class BT1{
	public void show() {
		for(int i = 1;i <= 10; i++){
		System.out.println("Hello");
		}
	}
}

public class T01Threads {

	public static void main(String[] args) {
		
		AT1 obj1 = new AT1();
		BT1 obj2 = new BT1();
		
		obj1.show();
		obj2.show();
		
	}
	
}
