
public class Leetcode_Fibonacci {
	 public int fib(int N) {
	        if(N ==0) return 0;
	        if(N==1) return 1;
	        int prev = 0;
	        int current = 1;
	        int fibo = prev + current;
	        for(int n=2;n<=N;n++){
	            fibo = prev + current;
	            prev = current;
	            current = fibo;
	        }
	        return fibo;
	    }
}
