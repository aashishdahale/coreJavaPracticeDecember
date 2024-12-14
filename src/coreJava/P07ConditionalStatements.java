package coreJava;

public class P07ConditionalStatements {

	public static void main(String[] args) {
	
		int x = 5;
		int y = 7;
		
		if(x > 10 && x < 20) {
			System.out.println("Hello");
		}
		else {
		System.out.println("Bye");
		}
		
		if(x > y) {
			System.out.println(x);
		}else if(y > x) {
			System.out.println(y);
		}
		
	}

}
