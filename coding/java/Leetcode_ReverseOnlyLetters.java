
public class Leetcode_ReverseOnlyLetters {
	/*
	 * Given a string S, return the "reversed" string where all characters that are not a letter stay in the same place, and all letters reverse their positions.

 

Example 1:

Input: "ab-cd"
Output: "dc-ba"
Example 2:

Input: "a-bC-dEf-ghIj"
Output: "j-Ih-gfE-dCba"
Example 3:

Input: "Test1ng-Leet=code-Q!"
Output: "Qedo1ct-eeLg=ntse-T!"
 

Note:

S.length <= 100
33 <= S[i].ASCIIcode <= 122 
S doesn't contain \ or "
	 */
	public String reverseOnlyLetters(String s) {
        StringBuilder reversed = new StringBuilder();
        int end = s.length()-1, start = 0;
        while(start <= s.length()-1){
            if(Character.isLetter(s.charAt(start))){
                while(!Character.isLetter(s.charAt(end))){
                    end--;
                }
                reversed.append(s.charAt(end--));
            }else{
                reversed.append(s.charAt(start));
            }
            start++;
        }
        return reversed.toString();
    }
}
