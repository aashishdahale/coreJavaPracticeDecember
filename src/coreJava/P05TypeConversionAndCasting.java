package coreJava;

public class P05TypeConversionAndCasting {

	public static void main(String[] args) {
		
		int a = 12;
		byte b = 127;
		
		//conversion
//		a=b;

		//casting
		b=(byte)a;
		System.out.println(b);
		
		int c = 257;
		byte d = (byte)c;
		System.out.println(d);
		
		float e = 5.6f;
		int g = (int)e;
		
		System.out.println(g);
		
		byte h = 10;
		byte i = 30;
		
//		automatic conversion
		int result = h*i;
		System.out.println(result);
		
	}

}
