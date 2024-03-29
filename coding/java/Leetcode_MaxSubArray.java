
public class Leetcode_MaxSubArray {
	/*
	 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

Example:

Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
Follow up:

If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
	 */
	public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE, currentSum = 0;
        for(int num: nums){
            currentSum = currentSum + num;
            if(maxSum < currentSum) maxSum = currentSum;
            if(currentSum < 0) currentSum = 0;
            }
        return maxSum;
    }
}
