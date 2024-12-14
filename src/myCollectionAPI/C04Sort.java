package myCollectionAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student04 implements Comparable<Student04> {
	int age;
	String name;

	public Student04(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public String toString() {
		return "Student04 [age=" + age + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Student04 that) {
		if (this.age > that.age)
			return 1;
		else
			return -1;
	}

}

public class C04Sort {

	public static void main(String[] args) {

		Comparator<Student04> com = (Student04 i, Student04 j) -> i.age > j.age ? 1 : -1;

		// if (i.age > j.age)
		// return 1;
		// else
		// return -1;

		List<Student04> stud = new ArrayList<Student04>();
		stud.add(new Student04(29, "Aashish"));
		stud.add(new Student04(25, "Shivani"));
		stud.add(new Student04(26, "Omakr"));
		stud.add(new Student04(24, "Tejas"));

		// Collections.sort(stud);

		System.out.println(stud);

	}

}
