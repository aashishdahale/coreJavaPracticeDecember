package coreJava;

public class P06Operators {

	public static void main(String[] args) {
		
		//Arithmetic Operator
		
		int num1 = 7;
		int num2 = 5;
		
		int result1 = num1 + num2;
		int result2 = num1 - num2;
		int result3 = num1 * num2;
		int result4 = num1 / num2;		//quotient

		int result5 = num1 % num2;		//remainder
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);

		num1 = num1 + 2;
		System.out.println(num1);
		
		num1 += 2;
		System.out.println(num1);
		num1 -= 2;
		System.out.println(num1);
		num1 *= 2;
		System.out.println(num1);
		num1 /= 2;
		System.out.println(num1);
		
		num1++;
		System.out.println(num1);
		num1--;
		System.out.println(num1);
		int c = ++num1;
		System.out.println(c);
		int d = --num1;
		System.out.println(d);

		//relational operator
		
		int x = 6;
		int y = 5;
		
		boolean result11 = x < y;
		System.out.println(result11);
		
		boolean result12 = x > y;
		System.out.println(result12);

		boolean result13 = x != y;
		System.out.println(result13);
		
		boolean result14 = x == y;
		System.out.println(result14);
		
		//Logical Operators
		
		int j = 7;
		int k = 5;
		int m = 5;
		int n = 9;
		boolean result15 = j > k && m < n;
		System.out.println(result15);

		boolean result16 = j > k || m < n;
		System.out.println(result16);
	}

}
