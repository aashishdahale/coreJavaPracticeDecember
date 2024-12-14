package coreJava;

class P23Human {
	private int age = 29;
	private String name = "Aashish";

	public int getAge() {
		return age;
	}
	public void setAge(int a) {
		age = a;
	}
	public String getName() {
		return name;
	}
	public void setName(String n) {
		name = n;
	}

}

public class P23Encapsulation {

	public static void main(String[] args) {

		P23Human obj = new P23Human();
		 obj.setAge(29);
		 obj.setName("Aashish");

		System.out.println(obj.getName() + " : " + obj.getAge());

	}

}
