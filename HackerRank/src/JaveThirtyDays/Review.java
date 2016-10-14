package JaveThirtyDays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Review {

	
	
	private static void printEvenOdd(String s) {
		List<Character> even = new ArrayList<Character>();
		List<Character> odd = new ArrayList<Character>();
		int len = s.length();
		char[] a = s.toCharArray();
		
		for(int i = 0; i < len; i++){
			if(i%2 == 0){
				even.add(a[i]);
			} else {
				odd.add(a[i]);
			} 
		}
		
		printArray(even);
		System.out.print(" ");
		printArray(odd);
//		System.out.println(Arrays.toString(even.toArray()));
//		System.out.println(Arrays.toString(odd.toArray()));
	}
	
	private static void printArray(List<Character> list) {
		for(Character c: list){
			System.out.print(c);
		}
	}
	
	
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	      Scanner scan = new Scanner(System.in);
	      int n = scan.nextInt();
	      scan.nextLine();
	      for (int i = 0; i < n; i++) {	    	  
	    	  printEvenOdd(scan.nextLine());
	    	  System.out.println();
	    	  
	      }
	      
	      scan.close();
    }
	
	
//	@Test
//	public void testPrintEvenOdd(){
//		printEvenOdd("Hacker");
//	}
}
