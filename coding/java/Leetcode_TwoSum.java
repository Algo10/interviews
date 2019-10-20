import java.util.HashMap;
import java.util.Map;

public class Leetcode_TwoSum {
	/*
	 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
	 */
	  public int[] twoSum(int[] nums, int target) {
	        int[] solution = new int[2];
	        int startIndex = -1, endIndex = -1;
	        Map<Integer/*num*/,Integer/*pos*/> numPosMap = new HashMap<>();
	        for(int i=0; i<nums.length; i++){
	            if(numPosMap.containsKey(target-nums[i])) {
	                startIndex = numPosMap.get(target-nums[i]);
	                endIndex = i;
	                if(startIndex != endIndex) break;
	            }else{
	                numPosMap.put(nums[i], i);
	            }
	        }
	        if(startIndex != -1 && startIndex != endIndex) return new int[]{startIndex, endIndex};
	        else return new int[2];    
	    }
}
