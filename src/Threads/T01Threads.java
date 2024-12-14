package Threads;

class AT1 extends Thread{
	public void run() {
		for(int i = 1;i <= 100; i++){
		System.out.println("Hi");
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
	}
}

class BT1 extends Thread{
	public void run() {
		for(int i = 1;i <= 100; i++){
		System.out.println("Hello");
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}

public class T01Threads {

	public static void main(String[] args) {
		
		AT1 obj1 = new AT1();
		BT1 obj2 = new BT1();
		
//		obj2.setPriority(1);
		System.out.println(obj1.getPriority());
		obj2.setPriority(Thread.MAX_PRIORITY);
		System.out.println(obj2.getPriority());
		
		obj1.start();
		
		try {
			Thread.sleep(2);
		} catch (Exception e) {
			
		}
		
		obj2.start();
		
	}
	
}
