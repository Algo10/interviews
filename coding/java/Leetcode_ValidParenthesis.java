import java.util.Stack;

public class Leetcode_ValidParenthesis {
	 public boolean isValid(String s) {
	        Stack<Character> brackets = new Stack<>();
	        for(char c: s.toCharArray()){
	            if(c == '{' || c == '(' || c == '[') brackets.push(c);
	            if(c == '}') {
	                if(brackets.isEmpty()) return false;
	                char b = brackets.pop();
	                if(b != '{') return false;
	            }
	            if(c == ']') {
	                if(brackets.isEmpty()) return false;
	                char b = brackets.pop();
	                if(b != '[') return false;
	            }
	            if(c == ')') {
	                if(brackets.isEmpty()) return false;
	                char b = brackets.pop();
	                if(b != '(') return false;
	            }
	        }
	        if(! brackets.isEmpty()) return false;
	        return true;
	    }
}
