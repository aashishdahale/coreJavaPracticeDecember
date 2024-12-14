package exceptionHandling;

class A48{
	public void show() throws ClassNotFoundException {
//		try {
			Class.forName("Test");
//		}catch (ClassNotFoundException e) {
//			System.out.println("Not able to find above class "+ e);
//		}
	}
}

public class E48ThrowsKeyword {

	public static void main(String[] args) {
		
		A48 obj = new A48();
		try {
			obj.show();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
