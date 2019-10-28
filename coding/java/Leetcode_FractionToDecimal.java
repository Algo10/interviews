import java.util.List;
import java.util.ArrayList;

/*
 * Given two integers representing the numerator and denominator of a fraction, return the fraction in string format.

If the fractional part is repeating, enclose the repeating part in parentheses.

Example 1:

Input: numerator = 1, denominator = 2
Output: "0.5"
Example 2:

Input: numerator = 2, denominator = 1
Output: "2"
Example 3:

Input: numerator = 2, denominator = 3
Output: "0.(6)"
 */
public class Leetcode_FractionToDecimal {
	public String fractionToDecimal(int numerator, int denominator) {
        StringBuilder fraction = new StringBuilder();
        int quotient = numerator/denominator;
        int remainder = numerator%denominator;
        if(quotient == 0 && ((numerator < 0 && denominator > 0) || (numerator > 0 && denominator < 0))){
            fraction.append("-");
        }
        fraction.append(quotient);
       
        if(remainder == 0) {
             return fraction.toString();
        }
        fraction.append(".");
        List previousRemainders = new ArrayList<>();
       
        while(true) {
            previousRemainders.add(remainder);
            int previousQuotient = quotient;
            numerator = remainder * 10;
            quotient = numerator/denominator;
            remainder = numerator%denominator;
            if(previousRemainders.contains(remainder)) {
                int i = previousRemainders.indexOf(remainder);
                
                fraction.append(Math.abs(quotient));
                fraction.append(")");
                fraction.insert(fraction.indexOf(".")+i+1,"(");
                return fraction.toString();
            }
            
            fraction.append(Math.abs(quotient));
            if(remainder == 0) break;
        }
       
        
        return fraction.toString();
        
    }
}
