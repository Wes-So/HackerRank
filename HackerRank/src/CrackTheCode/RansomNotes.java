package CrackTheCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.junit.Test;

public class RansomNotes {
	
    Map<String, Integer> magazineMap;
    Map<String, Integer> noteMap;
    String magazine;
    String note;
    
    public RansomNotes(String magazine, String note) {
        this.magazine = magazine;
        this.note = note;
        this.magazineMap = createHash(magazine);
        this.noteMap = createHash(note);
    }
    
    public boolean solve() {
    	boolean isMessagePossible = true;
    	
		for(String word:this.noteMap.keySet()) {
			if(this.magazineMap.containsKey(word)){
				int magCount = this.magazineMap.get(word);
				int noteCount = this.noteMap.get(word);
				if(! (noteCount <= magCount)){
					isMessagePossible = false;
					break;
				} 
			} else {
				isMessagePossible = false;
				break;				
			}
		}
		
		return isMessagePossible;
        
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        
        // Eat whitespace to beginning of next line
        scanner.nextLine();
        
        RansomNotes s = new RansomNotes(scanner.nextLine(), scanner.nextLine());
        scanner.close();
        
        boolean answer = s.solve();
        if(answer)
            System.out.println("Yes");
        else System.out.println("No");
      
    }
	
	
	private boolean isMessagePossible(String magazine, String msg) {
		boolean isMessagePossible = true;
		
		HashMap<String,Integer> magazineHash = createHash(magazine);
		HashMap<String,Integer> msgHash = createHash(msg);
		
		for(String word:msgHash.keySet()) {
			if(magazineHash.containsKey(word)){
				int magCount = magazineHash.get(word);
				int msgCount = msgHash.get(word);
				if(! (msgCount <= magCount)){
					isMessagePossible = false;
					break;
				} 
			} else {
				isMessagePossible = false;
				break;				
			}
		}
		return isMessagePossible;
	}
	
	private static HashMap<String,Integer> createHash(String sentence){
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		String[] splitString = sentence.split("\\s+");
		for(String word : splitString){
			if(map.containsKey(word)){
				map.put(word,map.get(word) + 1);
			} else {
				map.put(word, 1);
			}
		}
		
		return map;
	}
	
	
	
	@Test
	public void testRansomNote(){
		String magazine = "give me grand today night";
		String msg = "give one grand today";
		System.out.println(isMessagePossible(magazine,msg));
		
	}

}
