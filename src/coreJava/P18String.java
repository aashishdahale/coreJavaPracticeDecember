package coreJava;

public class P18String {

	public static void main(String[] args) {
	
		String name = "Aashish";

		System.out.println("Hello "+ name);
		System.out.println(name.hashCode());
		System.out.println(name.charAt(1));
		
		name = name + " Dahale";
		System.out.println(name);
		
		String s1 = "Aashish";
		String s2 = "Aashish";
		
		System.out.println(s1 == name);
		System.out.println(s1 == s2);
		
	}

}
