
public class Leetcode_AddStrings {
/*
 * Given two non-negative integers num1 and num2 represented as string, return the sum of num1 and num2.
 */
	
	public String addStrings(String num1, String num2) {
        int i = num1.length()-1;
        int j = num2.length()-1;
        StringBuilder sum = new StringBuilder();
        int carry = 0, addition = 0;
        while(i >= 0 && j >= 0){
            int d1 = num1.charAt(i)-'0';
            int d2 = num2.charAt(j)-'0';
            addition = (d1 + d2 + carry)%10;
            carry = (d1 + d2 + carry)/10;
            sum.insert(0, addition);
            i--;
            j--;
        }
        while(i>=0){
            int d1 = num1.charAt(i)-'0';
            addition = (d1 + carry)%10;
            carry = (d1 + carry)/10;
            sum.insert(0, addition);
            i--;
        }
        while(j>=0){
             int d2 = num2.charAt(j)-'0';
            addition = (d2 + carry)%10;
            carry = (d2 + carry)/10;
            sum.insert(0, addition);
            j--;
        }
        if(carry != 0){
            sum.insert(0, carry);
        }
        return sum.toString();
    }
    
}
