package coreJava;

class P24Human {
	private int age;
	private String name;

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

public class P24GetterAndSetter {

	public static void main(String[] args) {

		P24Human obj = new P24Human();
		
		System.out.println(obj.getName() + " : " + obj.getAge());
		
		obj.setAge(29);
		obj.setName("Aashish");

		System.out.println(obj.getName() + " : " + obj.getAge());

	}

}
