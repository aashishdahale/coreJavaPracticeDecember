package coreJava;

abstract class Car35 {
	public abstract void drive();
	public abstract void fly();
	
	public void playMusic() {
		System.out.println("Play Music");
	}

}

class WagonR extends Car35 {
	public void drive() {
		System.out.println("Driving");
	}

	@Override
	public void fly() {
		System.out.println("Flying");	
	}
}

public class P35AbstractKeyword {

	public static void main(String[] args) {

		Car35 obj = new WagonR();
		obj.drive();
		obj.playMusic();
		obj.fly();

	}

}
