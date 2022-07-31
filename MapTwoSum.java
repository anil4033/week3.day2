package week3.day2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapTwoSum {

	public static void main(String[] args) {
		
     /*
      * Map) Two Sum int[] nums = {2,4,6,7,11,15}; int target = 8; 
      * Hints: Subtract the number from target and check the diff 
      * number exist using Map!
      */
						
		int[] nums = {2,4,6,7,11,15};
		int target = 8;
		int difference = target -nums[0];
		Map<Integer,Integer> map = new LinkedHashMap<Integer,Integer>();
		
		for (int i =0; i<nums.length; i++)
		{
			if(nums[i] == difference) {
				map.put(nums[i], 2);

			}else {
			map.put(nums[i], 1);

			}
			
     		}
		System.out.println(map);
		
		for (Entry<Integer, Integer> entry : map.entrySet()) {
			
			if(entry.getValue() ==2)
				System.out.println("Difference value in Map is"+entry.getKey());
			
		}
	}
	
}



