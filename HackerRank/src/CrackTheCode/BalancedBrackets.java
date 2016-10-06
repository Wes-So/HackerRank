package CrackTheCode;

import java.util.Arrays;
import java.util.Stack;

import org.junit.Test;

public class BalancedBrackets {
	
	
    public static boolean isBalanced(String expression) {
    	boolean isBalanced = true;
    	//sort the string
    	//group types to 3 different stacks
    	//do the compare per stack
    	
    	
    	
    	
    	
    	String reverse = new StringBuffer(expression).reverse().toString();  
    	Stack<Character> expressionStack = createStack(expression);
    	Stack<Character> reverseStack = createStack(reverse);
    	
    	if(!expressionStack.isEmpty() && expressionStack.size() % 2 == 0){
    		int mid = expressionStack.size() / 2;
    		for(int i = 0; i < mid; i++) {
        		Character expr = expressionStack.pop();
        		Character rev = reverseStack.pop();
        		if(! isRightPair(expr,rev)){
        			return false;
        		} 
    		} 
    	} else {
    		return false;
    	}
    	return isBalanced;
    }
    
    
    private static String sortExpression(String expression){
    	char[] a =  expression.toCharArray();
    	Arrays.sort(a);
    	System.out.println();
    	
		return Arrays.toString(a);
    	
    }
    
    private static boolean isRightPair(Character expr, Character rev){
    	boolean isRightPair = false;
 
    	if(expr.equals('}') && rev.equals('{')) {
    		isRightPair = true;
    	} else if(expr.equals(')') && rev.equals('(')) {
    		isRightPair = true;
    	} else if(expr.equals(']') && rev.equals('[')) {
    		isRightPair = true;
    	}
    	
 
    	return isRightPair; 
    }
    
    private static Stack<Character> createStack(String s) {
		
    	Stack<Character> stack = new Stack<Character>();
    	for(char c: s.toCharArray()){
    		stack.push(c);
    	} 
    	
    	return stack; 
    }
    
    @Test
    public   void testIsBalanced(){ 
    	String expression = "{}[([{[{{}()}]{}}([[{}[]]({}{{()}[][][]})])])]";

    	if(isBalanced(expression)){
    		System.out.println("YES");
    	} else {
    		System.out.println("NO");
    	}
    } 
    
}
