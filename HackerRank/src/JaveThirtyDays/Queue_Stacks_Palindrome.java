package JaveThirtyDays;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import org.junit.Test;

public class Queue_Stacks_Palindrome {
	Queue<Character> queue = new LinkedList<>();
	Stack<Character> stack = new Stack<>();
	
	void pushCharacter(char c){
		stack.push(c);
	}
	
	void enqueueCharacter(char ch){
		queue.add(ch);
	}
	
	char popCharacter(){
		return stack.pop();
	}
	
	char dequeueCharacter(){
		return queue.remove();
	}
	
//	private boolean isPalindrome(String word) {
//		boolean isPalindrome = true;
//		
//		Queue<Character> queue = new LinkedList<>();
//		Stack<Character> stack = new Stack<>();
//		
//		for(char letter:word.toCharArray()){
//			queue.add(letter);
//			stack.push(letter);
//		}
//		
//		for(int i = 0; i < word.length();i++){
//			 
//			if(! queue.remove().equals(stack.pop())){
//				isPalindrome = false;
//				break;
//			}
//		} 
//		
//		return isPalindrome;
//	}
//	
//	@Test
//	public void testPalindrome(){
//		System.out.println(isPalindrome("racecar"));
//		System.out.println(isPalindrome("race2car"));
//	}
	
}
