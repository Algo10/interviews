import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode_FindAllAnagrams {
	/*
	 * Given a string s and a non-empty string p, find all the start indices of p's anagrams in s.

Strings consists of lowercase English letters only and the length of both strings s and p will not be larger than 20,100.

The order of output does not matter.

Example 1:

Input:
s: "cbaebabacd" p: "abc"

Output:
[0, 6]

Explanation:
The substring with start index = 0 is "cba", which is an anagram of "abc".
The substring with start index = 6 is "bac", which is an anagram of "abc".
Example 2:

Input:
s: "abab" p: "ab"

Output:
[0, 1, 2]

Explanation:
The substring with start index = 0 is "ab", which is an anagram of "ab".
The substring with start index = 1 is "ba", which is an anagram of "ab".
The substring with start index = 2 is "ab", which is an anagram of "ab".
	 */
	private int MAX = 20100;
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> positions = new ArrayList<>();
      
        int pLength = p.length();
        int sLength = s.length();
        
        if(sLength < pLength) return positions;
        
        int[] sChars = new int[MAX];
        int[] pChars = new int[MAX];
        for(int i=0;i<pLength;i++){
            pChars[p.charAt(i)]++;
            sChars[s.charAt(i)]++;
        }
        for(int j=pLength;j<sLength;j++){
            if(Arrays.equals(pChars, sChars)){
                positions.add(j-pLength);
            }
            sChars[s.charAt(j-pLength)]--;
            sChars[s.charAt(j)]++;
        }
        if(Arrays.equals(pChars, sChars)){
                positions.add(sLength-pLength);
            }
        return positions;
    }
   
}
