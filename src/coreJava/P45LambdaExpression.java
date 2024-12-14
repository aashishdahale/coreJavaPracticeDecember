package coreJava;

@FunctionalInterface
interface A45{
	
	int add(int i,int j);
	
}

public class P45LambdaExpression {

	public static void main(String[] args) {

		A45 obj = (i, j) -> i+j;
		
		int result = obj.add(5, 4);
		System.out.println(result);
		
	}

}
