package JaveThirtyDays;

import org.junit.Test;

public class Loops {
	
	private void printNumbers(int input){
		for(int i = 1; i < 11; i++){
			int result = i * input;
			System.out.println(input + " x " + i + " = " + result);			
		} 
	}
	
	@Test
	public void testPrintNumbers(){
		printNumbers(2);
	}

}
