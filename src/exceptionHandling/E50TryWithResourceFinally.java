package exceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class E50TryWithResourceFinally {

	public static void main(String[] args) throws NumberFormatException, IOException {

//		BufferedReader br = null;
		
		
//		int i = 0;
//		int j = 0;
//		
//		try {
//			j = 18/i;
//			System.out.println("Bye");
//		} catch(Exception e) {
//			System.out.println("Something went wrong");
//		} finally {
//			System.out.println("Run");
//		}

//		int num = 0;
//		try {
//			br = new BufferedReader(new InputStreamReader(System.in));
//			num = Integer.parseInt(br.readLine());
//			System.out.println(num);
//
//		} finally {
//			br.close();
//		}
		
		
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			
			int num = Integer.parseInt(br.readLine());
			System.out.println(num);
		}
		

	}

}
