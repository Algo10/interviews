
public class Leetcode_LongestCommonPrefix {
/*
 * Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 */
	public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        int prefixLength = 0;
        while(prefixLength < Integer.MAX_VALUE){
            if(!strPrefixEquals(strs,prefixLength)) break;
            prefixLength++;
        }
       return strs[0].substring(0,prefixLength);
    }
    
    private boolean strPrefixEquals(String[] strs, int index) {
        if(strs[0].length() <= index) return false;
        char prefixChar = strs[0].charAt(index);
        for(String str: strs){
            if(str.length() <= index || prefixChar != str.charAt(index)) {
                return false;
            }
            prefixChar = str.charAt(index);
        }
        return true;
    }
}
