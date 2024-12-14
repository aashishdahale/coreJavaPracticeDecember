package coreJava;

class A27{
	public A27() {
		System.out.println("Object Created");
	}
	
	public void show(){
		System.out.println("In A show");
	}
}

public class P27AnonymousObject {

	public static void main(String[] args) {
		
		new A27().show();	// anonymous object
		new A27().show();	// anonymous object

	}

}
