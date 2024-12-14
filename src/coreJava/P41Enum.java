package coreJava;

//enum are named constant

enum Status {
	Running, Failed, Pending, Sucess;
}

public class P41Enum {

	public static void main(String[] args) {

//		Status s = Status.Sucess;
//		System.out.println(s);
//		System.out.println(s.ordinal());

//		Status[] ss = Status.values();
//		System.out.println(ss[0]);
//		for(Status s:ss) {
//			System.out.println(s + " : " + s.ordinal());
//		}
		
		
		Status s = Status.Pending;
		
//		if(s == Status.Running) {
//			System.out.println("All Good");
//		}else if(s == Status.Failed) {
//			System.out.println("Try Again");
//		}else if(s == Status.Pending){
//			System.out.println("Please Wait");
//		}else {
//			System.out.println("Done");
//		}
		
		switch (s) {
		case Running : 
			System.out.println("All Good");
			break;
		case Failed : 
			System.out.println("Try Again");
			break;
		case Pending : 
			System.out.println("Please Wait");
			break;
		default:
			System.out.println("Done");
			break;
		}
		
	}

}
