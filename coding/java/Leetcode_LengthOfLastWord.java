
public class Leetcode_LengthOfLastWord {
/*
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

If the last word does not exist, return 0.

Note: A word is defined as a character sequence consists of non-space characters only.

Example:

Input: "Hello World"
Output: 5
 */
	 public int lengthOfLastWord(String s) {
	        int len = 0; 
	  
	        String x = s.trim(); 
	  
	        for (int i = 0; i < x.length(); i++) { 
	            if (x.charAt(i) == ' ') 
	                len = 0; 
	            else
	                len++; 
	        } 
	  
	        return len; 
	    }
}
