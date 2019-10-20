
public class Leetcode_ValidAnagram {
	/*
	 * Given two strings s and t , write a function to determine if t is an anagram of s.

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
Note:
You may assume the string contains only lowercase alphabets.

Follow up:
What if the inputs contain unicode characters? How would you adapt your solution to such case?
	 */
	public boolean isAnagram(String s, String t) {
        int[] charCount = new int[26];
        if(s==null && t==null) return true;
        if(s==null && t!=null) return false;
        if(s!=null && t==null) return false;
        if(s.length()!=t.length()) return false;
        for(char c: s.toCharArray()){
            charCount[c-'a']++;
        }
        for(char c: t.toCharArray()){
            charCount[c-'a']--;
        }
        for(int i:charCount){
            if(i!=0) return false;
        }
        return true;
    }

}
