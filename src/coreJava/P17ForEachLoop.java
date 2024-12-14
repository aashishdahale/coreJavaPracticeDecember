package coreJava;

public class P17ForEachLoop {

	public static void main(String[] args) {

		int arr [] = new int [6];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]= i;
		}
		
		for(int m:arr) {
			System.out.print(m +" ");
		}

	}

}
