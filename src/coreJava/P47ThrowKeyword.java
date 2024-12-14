package coreJava;

class AshException extends Exception{
	public AshException(String str) {
		super(str);
	}
}

public class P47ThrowKeyword {
	public static void main(String[] args) {

		int i = 20;
		int j = 0;
		try {
			j = 18 / i;
			if(j==0)
				throw new AshException("I dont want to print zero");

		} catch (AshException e) {
			j= 18/1;
			System.out.println("This is default output " + e);
		} catch (Exception e) {
			System.out.println("Something went wrong test" + e);
		}

		System.out.println(j);

		System.out.println("Bye");
	}
}
