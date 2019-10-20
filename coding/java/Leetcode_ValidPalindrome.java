
public class Leetcode_ValidPalindrome {
	public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int start = 0, end = s.length() -1, mid = s.length()/2-1;
        while(start <= mid && end >= mid){
            while(start < s.length() && !isAlphaNumeric(s.charAt(start))) start++;
            while(end  > 0 && !isAlphaNumeric(s.charAt(end))) end--; 
            if(start < s.length() && end > 0 && s.charAt(start) != s.charAt(end)) {
                return false;
            }
            else {
                start++;
                end--;
            }      
        }
        return true;    
            
    }
    private boolean isAlphaNumeric(char c){
        if(c >= '0' && c <= '9') return true;
        if(c >= 'a' && c <= 'z') return true;
        return false;    
    }
}
