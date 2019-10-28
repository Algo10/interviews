
public class Leetcode_MoveZeroes {
	/*
	 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Example:

Input: [0,1,0,3,12]
Output: [1,3,12,0,0]
Note:

You must do this in-place without making a copy of the array.
Minimize the total number of operations.
	 */
	public void moveZeroes(int[] nums) {
        int current=0, copyIndex = 0;
        while(current < nums.length){
            if(nums[current]!=0) {
                nums[copyIndex++] = nums[current];
            }
            current++;
        }
        while(copyIndex < nums.length){
             nums[copyIndex++] = 0;
        }
    }
}
