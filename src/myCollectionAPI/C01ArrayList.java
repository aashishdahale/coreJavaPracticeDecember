package myCollectionAPI;

import java.util.ArrayList;
//import java.util.Collection;
import java.util.List;

public class C01ArrayList {

	public static void main(String[] args) {
		
		List<Integer> nums = new ArrayList<Integer>();
		nums.add(9);
		nums.add(8);
		nums.add(3);
		nums.add(1);
		nums.add(8);
		
//		Methods of List
//		System.out.println(nums.indexOf(3));
//		System.out.println(nums.get(3));
		
//		for(int n : nums) {
//			System.out.print(n + " ");
//		}
		
//		System.out.println();
		System.out.println(nums);
	}

}
