package coreJava;

public class P09Loops {

	public static void main(String[] args) {
		
		int count = 1;
		
		while(count <= 10) {
			System.out.println("Hi "+ count);
			count++;
		}
		
		int n = 1;
		
		do {
			System.out.println("Hello "+ n);
			n++;
		}while(n <= 10);

		for(int i=1;i<=10;i++) {
			System.out.println("Namaste "+ i);
		}
		
	}

}
