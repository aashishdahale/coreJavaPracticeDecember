package coreJava;

interface Computer40{
	void code();
}

class Laptop40 implements Computer40{
	public void code() {
		System.out.println("code, compile, run");
	}
}

class Desktop40 implements Computer40{
	public void code() {
		System.out.println("code, compile, run : Faster");
	}
}

class Devloper40{
	public void devApp(Computer40 comp) {
		comp.code();
	}
}

public class P40NeedOfInterface {

	public static void main(String[] args) {
	
		Computer40 lap = new Laptop40();
		Computer40 desk = new Desktop40();
		
		Devloper40 ash = new Devloper40();
		ash.devApp(lap);
		ash.devApp(desk);
		

	}

}
