package interview;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class Fibonacci {
	
	public static List<Integer> fibonacci(int n) {
		
		List<Integer> sequence = initializeSequence(n); 
		
		if(n > 2){
			for(int i = 2; i < n; i++){ 
				int sum = sequence.get(i - 2) + sequence.get(i - 1);
				sequence.add(sum);
			}
		}
		return sequence;
	}
	
	@Test
	public void testFibonacci(){
		    
		    assertEquals(Arrays.asList(0), fibonacci(1));
		    assertEquals(Arrays.asList(0, 1), fibonacci(2));
		    assertEquals(Arrays.asList(0, 1, 1), fibonacci(3));
		    assertEquals(Arrays.asList(0, 1, 1, 2), fibonacci(4));
		    assertEquals(Arrays.asList(0, 1, 1, 2, 3), fibonacci(5));
		    assertEquals(Arrays.asList(0, 1, 1, 2, 3, 5), fibonacci(6));
		    assertEquals(Arrays.asList(0, 1, 1, 2, 3, 5, 8), fibonacci(7));
		    assertEquals(Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13), fibonacci(8));
	}
	
	
	public static int fibN(int n){
		List<Integer> sequence = fibonacci(n);
		return sequence.get(n);
	}
	
	private static List<Integer> initializeSequence(int n){
		List<Integer> sequence = new ArrayList<>(); 
		
		if(n == 1) {
			sequence.add(0);
		} else if(n >= 2) {
			sequence.add(0);
			sequence.add(1);
		}
		
		return sequence; 
	}
}
