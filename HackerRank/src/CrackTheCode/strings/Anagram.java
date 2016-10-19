package CrackTheCode.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class Anagram {
    public static int numberNeeded(String first, String second) {
		int counter = 0;
		HashMap<Character,Integer> firstMap = createHash(first); 		
		HashMap<Character,Integer> secondMap = createHash(second); 
		
		//first loop for difference in first hashmap
		counter = counter + compareHashMap(firstMap, secondMap);
	
		//second loop for difference in second hashmap
		counter = counter + compareHashMap(secondMap, firstMap);
 		
		//third loop for similar items
		for(Character c: firstMap.keySet()){
			if(secondMap.containsKey(c)){
				int firstVal = firstMap.get(c);
				int secondVal = secondMap.get(c);
				if(firstVal != secondVal){
					int diff = Math.abs(firstVal - secondVal);
					counter = counter + diff;
				}
			}
		}		
		
		return counter;         
    }
	
	private int	isAnagram(String s1, String s2){
		int counter = 0;
		HashMap<Character,Integer> first = createHash(s1); 		
		HashMap<Character,Integer> second = createHash(s2); 
		
		//first loop for difference in first hashmap
		counter = counter + compareHashMap(first, second);
	
		//second loop for difference in second hashmap
		counter = counter + compareHashMap(second, first);
 		
		//third loop for similar items
		for(Character c: first.keySet()){
			if(second.containsKey(c)){
				int firstVal = first.get(c);
				int secondVal = second.get(c);
				if(firstVal != secondVal){
					int diff = Math.abs(firstVal - secondVal);
					counter = counter + diff;
				}
			}
		}		
		
		return counter; 
	}
	
	private static int  compareHashMap(Map<Character, Integer> compared, Map<Character,Integer> master){
		int counter = 0;
		for(Character c: compared.keySet()){
			if(!master.containsKey(c)){
				counter = counter + compared.get(c);
			}
		}		
		
		
		return counter;
	}
	
	private static HashMap<Character,Integer> createHash(String s){
		HashMap<Character,Integer> first = new HashMap<Character,Integer>();
		for(char c : s.toCharArray()){
			if(first.containsKey(c)){
				first.put(c,first.get(c) + 1);
				
			} else {
				first.put(c, 1);
			}
		}
		
		return first;
	}
	
	private String sortString(String s) {
		char[] a = s.toCharArray();
		Arrays.sort(a);
		System.out.println(a);
		return a.toString();
	}
	
	@Test
	public void testIsAnagram(){
		String s1 = "fcrxzwscanmligyxyvym" ;
		sortString(s1);  
		String s2 = "jxwtrhvujlmrpdoqbisbwhmgpmeoke";
		sortString(s2);
		 
		int counter = numberNeeded(s1, s2);
		System.out.println(counter);//30
		
	}

}
