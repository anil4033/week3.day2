package week3.day2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapSingleNum {

	public static void main(String[] args) {
		 
		/*
		 * (Map) Single Number (Print only single occurance numbers) int[] nums = {1,2,1,3,2,5}; --> 3,5 ! 
		 *  Hints: Use Map and find each occurance.
		 */
		
		int[] nums = {1,2,1,3,2,5};
		
		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		
		for (int i = 0; i < nums.length; i++) {
						
			map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
			
			}
		
		for (Entry<Integer, Integer> entry : map.entrySet()) {
			
			if(entry.getValue() == 1) {
				System.out.println(entry.getKey());
			}
			
		}
			
	}
		
}


