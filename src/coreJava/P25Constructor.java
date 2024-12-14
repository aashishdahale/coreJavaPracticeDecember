package coreJava;

class P25Human {
	private int age;
	private String name;

	public P25Human() {
		age = 12;
		name = "John";
	}

	public P25Human(int a, String n) {
		age = a;
		name = n;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

public class P25Constructor {

	public static void main(String[] args) {

		P25Human obj = new P25Human();
		P25Human obj1 = new P25Human(18, "Shiva");
		System.out.println(obj.getName() + " : " + obj.getAge());
		System.out.println(obj1.getName() + " : " + obj1.getAge());

		obj.setAge(29);
		obj.setName("Aashish");

		System.out.println(obj.getName() + " : " + obj.getAge());
	}

}
