package interview;

import org.junit.Test;

public class FizzBuzz {

	private void process(int n){
		for(int i = 1; i <= n; i++){
			if(i%15 == 0){
				System.out.println("FizzBuzz");
			} else if(i%5 == 0){
				System.out.println("Buzz");				
			} else if(i%3 == 0){
				System.out.println("Fizz");
			} else {
				System.out.println(i);
			}
		}
	}
	
	@Test
	public void testProcess(){
		process(30);
	}
	
}
