package interview;

import org.junit.Test;

public class Factorial {

	public  static long factorial(int n){
		long total = 1;
		for(int i = 1; i <=n; i++ ){
			total *= i;
		}
		
		return total;
	}
	
	@Test
	public void testFactorial(){
		System.out.println(factorial(5));
	}
}
