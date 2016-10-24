package JaveThirtyDays;

import java.util.Arrays;

import org.junit.Test;

public class BubbleSort {
	
	
	public int[]  sort(int[] input) {
		 
		boolean isSorted = false;
		int changeCtr = 0;
		int swapCtr = 0;
		while(!isSorted){
			
			for(int i = 0; i < input.length; i++) {
				if(i + 1 == input.length){
					break;
				} else {
					if(input[i] > input[i+1]){
						int temp = input[i+1];
						input[i + 1] = input[i];
						input[i] = temp;
						changeCtr++;
						swapCtr++;
					} 
				}
			} 
			
			if(changeCtr == 0){
				isSorted = true;
			} else {
				changeCtr = 0;
			}
			
		}
		
		System.out.println("Array is sorted in " + swapCtr + " swaps.");
		System.out.println("First element: " + input[0]);
		System.out.println("Last element: " + input[input.length - 1]);
		
		return input;
	}
	
	@Test
	public void testSort(){
		int[] input = {1,2,3};
		int[] output = sort(input);
		System.out.println(Arrays.toString(output));
		
	}

}
