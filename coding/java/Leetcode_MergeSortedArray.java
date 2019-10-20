
public class Leetcode_MergeSortedArray {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1,j=n-1,c=m+n-1;
        while(i>=0 && j >=0){
            if(nums1[i] >= nums2[j]){
                nums1[c] = nums1[i];
                i--;
                c--;
            }else{
                nums1[c] = nums2[j];
                j--;
                c--;
            }
        }
        while(j >= 0){
             nums1[c] = nums2[j];
                j--;
                c--;
        }
    }
}
