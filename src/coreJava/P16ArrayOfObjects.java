package coreJava;

class P16Student{
	int rollno;
	String name;
	int marks;
}

public class P16ArrayOfObjects {

	public static void main(String[] args) {
	
		P16Student s1 = new P16Student();
		s1.rollno = 1;
		s1.name = "Aashish";
		s1.marks = 99;
		
		P16Student s2 = new P16Student();
		s2.rollno = 2;
		s2.name = "Shivani";
		s2.marks = 98;
		
		P16Student s3 = new P16Student();
		s3.rollno = 1;
		s3.name = "Omkar";
		s3.marks = 97;
		
		P16Student students [] = new P16Student[3];
		students[0]=s1;
		students[1]=s2;
		students[2]=s3;
		
//		for (int i = 0; i < students.length; i++) {
//			System.out.println(students[i].name+" "+students[i].rollno+" "+students[i].marks);
//		}
		
		for(P16Student stud: students) {
			System.out.println(stud.name+" "+stud.rollno+" "+stud.marks);
		}
			
	}

}
