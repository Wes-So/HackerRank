package CrackTheCode.stacks;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;

import org.junit.Test;

public class BalancedBrackets_Improved {
	
	
	@Test
	public void testIsBalanced() throws IOException {
		//String expression = "((()))[]{[(()({[()({[]}{})]}))]}{[]}{{({}{})[{}{}]{()([()])[{()}()[[]{}()]{}{}[]()]}[[]{[]}([])]}}";
		BufferedReader input = new BufferedReader(new FileReader("C:/Users/wso/Desktop/input.txt"));
		BufferedReader output = new BufferedReader(new FileReader("C:/Users/wso/Desktop/output.txt"));
		String expression ="";
		String answer = "";
		String code = "";
		int counter = 0;
		while((expression = input.readLine()) != null){
			answer = output.readLine();
			if ( isBalanced(expression)) {
				code = "YES";
			} else {
				code = "NO";
			}
			counter++;
			System.out.println(counter);
			assertEquals(answer, code);
		}
		

	}

	public static boolean isBalanced(String expression){
		//declare a stack data structure
		Stack<Character> container = new Stack<>();
		
		//convert expression to char array
		char[] characters = expression.toCharArray();
		
		//loop around expression
		for(int i = 0; i < characters.length; i++){
			//check if character is open char then put in stack
			if(isOpenChar(characters[i])){
				container.push(characters[i]);
			} else {
				//check if container is not empty
				if(! container.isEmpty()){
					char open = container.peek();
					if(isMatched(open,characters[i])){
						container.pop();						
					} else {
						return false;
					}
				} else {
					return false;
				}
			}
		}
		if(container.isEmpty()){
			return true;
		} 
		
		return false;
	}
	
	
	private static boolean isMatched(char open, char close){
		if(open == '{' && close == '}'){
			return true;
		} else if(open == '[' && close == ']') {
			return true;
		} else if(open == '(' && close == ')'){
			return true;
		} else {
			return false;
		}
	}
	
	
	private static boolean isOpenChar(char c){
		if(c == '{' || c == '[' || c == '('){
			return true;
		}
		
		return false;
	}
}
