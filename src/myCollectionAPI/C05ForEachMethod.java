package myCollectionAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class C05ForEachMethod {

	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(4,5,7,3,2,6);
		
		Consumer<Integer> con = (Integer n) -> System.out.println(n);		;
		
		nums.forEach(con);
		
//		for(int i = 0;i < nums.size();i++) {
//			System.out.println(nums.get(i));
//		}
		
//		for(int i:nums) {
//			System.out.println(i);
//		}
		
//		int sum = 0;
//		for(int n:nums) {
//			if(n%2==0) {
//				n=n*2;
//				sum = sum + n;
//			}
//		}
		
//		nums.forEach(n -> System.out.println(n));
		
//		System.out.println(sum);
		
	}

}
