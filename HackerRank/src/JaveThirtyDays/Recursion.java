package JaveThirtyDays;

import org.junit.Test;

public class Recursion {
	
	private int factorial(int n) {
		
		if(n <= 2){
			return n;
		} else {
			return n * factorial(n-1);			
		}
	}

	@Test
	public void testFactorial(){
		System.out.println(factorial(4));
		System.out.println(factorial(7));
		System.out.println(factorial(5));
	}
}
