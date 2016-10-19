package JaveThirtyDays;

import org.junit.Test;

public class Calculator implements AdvancedArithmetic {
	int power(int n, int p) throws IllegalArgumentException {
		if( n < 0 || p < 0){
			throw new IllegalArgumentException("n and p should be non-negative");
		} else {
			return (int) Math.pow(n,p);
		} 
	}

	@Override
	public int divisorSum(int n) {
		int total = 0;
		for(int i = 1; i <= n; i++){
			if(n % i == 0){
				total += i;
			}
		}
		
		return total;
	}
	
	@Test
	public void testDivisorSum(){
		System.out.println(divisorSum(6));
	}
}
