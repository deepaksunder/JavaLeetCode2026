package leet.program;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	 public static int[] twoSum(int[] nums, int target) {

	        Map<Integer, Integer> numsMap = new HashMap<>();
	        for(int i=0;i<nums.length;i++){
	                numsMap.put(nums[i],i);
	                int val = target-nums[i];
	                if(numsMap.containsKey(val)){
	                    int[] arr = {i, numsMap.get(val)};
	                    return arr ;
	                }
	        }
			return null;
	        
	    }
	 
	 public static void main(String[] args) {
		 int[] arr = {2,7,11,15};
		 int[] val = twoSum(arr, 9);
		 System.out.println(Arrays.toString(val));
		 System.out.println((5+5)%10);
	}
}
