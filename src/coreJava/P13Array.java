package coreJava;

public class P13Array {

	public static void main(String[] args) {

		int arr1 [] = {1,2,3,4,5};
		int arr2 [] = new int [5];

		arr1[3]=8;

		for(int i = 0; i< arr1.length;i	++) {
			System.out.println(arr1[i]);
		}

		for(int i=0;i<	arr2.length;i++) {
			arr2[i]=i;
			System.out.println(arr2[i]);
		}	
		

	}

}
