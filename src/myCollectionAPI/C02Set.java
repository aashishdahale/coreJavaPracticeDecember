package myCollectionAPI;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class C02Set {
	public static void main(String[] args) {
		
//		Set<Integer> nums = new HashSet<Integer>();
		Set<Integer> nums = new TreeSet<Integer>();
		nums.add(9);
		nums.add(8);
		nums.add(3);
		nums.add(1);
		nums.add(8);
		
		Iterator<Integer> values = nums.iterator();
		
		while(values.hasNext())
		System.out.println(values.next());
		
//		for(int n : nums) {
//			System.out.print(n + " ");
//		}
		
//		System.out.println();
//		System.out.println(nums);
	}
}
