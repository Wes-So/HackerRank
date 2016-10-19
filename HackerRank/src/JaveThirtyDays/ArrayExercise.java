package JaveThirtyDays;

import org.junit.Test;

import java.util.Arrays;
import java.util.Arrays.*;

public class ArrayExercise {

	private int[] reverseArrays(int[] arr){
		
		int[] reverse = new int[arr.length];
		for(int i = arr.length; i > 0; i--){
			reverse[arr.length - i] = arr[i-1];
		}
		
		return reverse; 
	}
	
	@Test
	public void testReverseArrays(){
		int[] arr = {1,4,3,2};
		int[] reverse = reverseArrays(arr);
		 
		System.out.println(Arrays.toString(reverse));
	}
}
