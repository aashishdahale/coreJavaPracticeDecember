package Threads;

class Counter04 {
	int count;

	public synchronized void increment() {
		count++;
	}
}

public class T04RaceConditionUsingSynchronized {
	public static void main(String[] args) throws InterruptedException {

		Counter04 co = new Counter04();

		Runnable obj1 = () -> {
			for (int i = 1; i <= 10000; i++) {
				co.increment();
			}
		};

		Runnable obj2 = () -> {
			for (int i = 1; i <= 10000; i++) {
				co.increment();
			}
		};

		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);

		t1.start();
		t2.start();

		t1.join();
		t2.join();
		
		System.out.println(co.count);

	}
}
