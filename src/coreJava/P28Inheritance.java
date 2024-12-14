package coreJava;

class P28Calc {
	public int add(int n1, int n2) {
		return n1 + n2;
	}

	public int sub(int n1, int n2) {
		return n1 - n2;
	}
}

class P28AdvCalc extends P28Calc {
	public int mul(int n1, int n2) {
		return n1 * n2;
	}

	public int div(int n1, int n2) {
		return n1 / n2;
	}
}

class P28VeryAdvCalc extends P28AdvCalc {
	public double power(int n1, int n2) {
		return Math.pow(n1, n2);
	}
}

public class P28Inheritance {

	public static void main(String[] args) {

		P28VeryAdvCalc obj = new P28VeryAdvCalc();
		int r1 = obj.add(4, 5);
		int r2 = obj.sub(7, 5);
		int r3 = obj.mul(7, 5);
		int r4 = obj.div(8, 2);
		double r5 = obj.power(8, 2);

		System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + " " + r5);
	}

}
