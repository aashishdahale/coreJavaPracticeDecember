package Threads;

class ZT2{
	
}

class AT2 implements Runnable{
	public void run() {
		for(int i = 1;i <= 5; i++){
		System.out.println("Hi");
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
	}
}

class BT2 implements Runnable{
	public void run() {
		for(int i = 1;i <= 5; i++){
		System.out.println("Hello");
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
	}
}

public class T02Runnable {

	public static void main(String[] args) {
		
		AT2 obj1 = new AT2();
		BT2 obj2 = new BT2();
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);

		t1.start();	
		t2.start();
		
	}
	
}
