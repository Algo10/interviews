
public class Leetcode_ReverseInteger {
	public int reverse(int x) {
        boolean isNegative = false;
        if(x < 0) {
            isNegative = true;
            x = Math.abs(x);
        }
        int reversed = 0;
        while(x > 0){
            int currentDigit = x%10;
            if (reversed > Integer.MAX_VALUE/10 || (reversed == Integer.MAX_VALUE / 10 && currentDigit > 7)) return 0;
            if (reversed < Integer.MIN_VALUE/10 || (reversed == Integer.MIN_VALUE / 10 && currentDigit < -8)) return 0;
            reversed = reversed*10 + currentDigit;
            x = x/10;
        }
        if(isNegative) return reversed * -1;
        return reversed;
    }
}
