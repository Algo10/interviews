import java.util.ArrayList;
import java.util.List;

public class Leetcode_CountPrimes {
	 public int countPrimes(int n) {
	        if(n <= 2) return 0;
	        int primeCount = 1;
	        List<Integer> primes = new ArrayList<>();
	        primes.add(2);
	        for(int i=3;i<n;i++){
	            if(isPrime(i, primes)) {
	                primeCount++;
	                primes.add(i);
	            }
	        }
	        return primeCount;
	    }
	    
	    public boolean isPrime(int no, List<Integer> primes){
	        
	        for(Integer p: primes){
	            if(no % p == 0) return false;
	            if(p > Math.sqrt(no)) break;
	        }
	       
	        return true;
	    }
}
