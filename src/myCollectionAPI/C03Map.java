package myCollectionAPI;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class C03Map {

	public static void main(String[] args) {

//		Map<String, Integer> students = new HashMap<String, Integer>();
		Map<String, Integer> students = new Hashtable<String, Integer>();

		students.put("Ash", 99);
		students.put("Shivani", 99);
		students.put("Omkar", 99);
		students.put("Tejas", 99);
		students.put("Dinesh", 99);

		students.put("Dinesh", 50);

		//		System.out.println(students);
		//		System.out.println(students.get("Ash"));
		//		System.out.println(students.keySet());

		for (String key : students.keySet()) {
			System.out.println(key + " " + students.get(key));
		}

	}

}
