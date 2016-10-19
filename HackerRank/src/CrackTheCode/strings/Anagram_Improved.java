package CrackTheCode.strings;

import java.util.Arrays;

import org.junit.Test;

public class Anagram_Improved {
	
	private int numberNeeded(String first, String second){
		//transform first to array
		int[] firstArray = assignToArray(first);
		//transform second to array
		int[] secondArray = assignToArray(second);
		//compare difference between 2 array
		System.out.println(Arrays.toString(firstArray));
		System.out.println(Arrays.toString(secondArray));
		return computeDifference(firstArray,secondArray);
		
	}
	
	private static int computeDifference(int[] firstArray, int[] secondArray){
		int total = 0;
		for(int i = 0; i < firstArray.length; i ++){
			total += Math.abs(firstArray[i] - secondArray[i]);
		}
		return total;
	}
	
	private static int[] assignToArray(String word){
		int[] array = new int[26];
		for(Character c: word.toCharArray()){
			
			int val = c.hashCode() - 97; 
			if(array[val] > 0) {
				array[val] = array[val] + 1;	
			} else {
				array[val] = 1;
			} 
		}
		
		return array;
	}
	
	@Test
	public void testSolution(){
		System.out.println(numberNeeded("aaaaaaaaaaaaaaaaaaaaaaaaaaaaa","bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb")); 
	}
	
	
}
