package interview;

import java.util.Stack;

import org.junit.Test;

public class StringReversal {

	public static String reverse(final String word){
		Stack<Character> stack = new Stack<>();
		
		for(Character c: word.toCharArray()){
			stack.push(c);
		}
		
		StringBuilder reverse = new StringBuilder();
		 
		while(!stack.isEmpty()){			
			reverse.append(stack.pop());
		}
		
		return reverse.toString(); 
	}
	
	@Test
	public void testReverse(){
		System.out.println(reverse("Wilson is awesome"));
	}
	
}
