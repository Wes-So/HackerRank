package CrackTheCode;

import java.util.HashMap;
import java.util.LinkedList;

import org.junit.Test;

public class Cycle {
    private class Node<E> {
        private E data;
        private Node<E> next;
        
        private Node(E data) {
            this.data = data;
            this.next = null;
        }
        
        private Node next(){
			return next;
        	
        }
    }
	
	@Test
	public void playingWithLinkedList(){
		LinkedList<String> play = new LinkedList<String>();
		play.add("First");
		play.add("Second");
		
		
		
		
		System.out.println(play.size());
		System.out.println(play.get(0));
		System.out.println(play.element());
		
		
	}
	
	
	boolean hasCycle(Node head) {
	    HashMap<Node,Integer> nodeMap = new HashMap<Node,Integer>(); 
	    while(head != null){
	    	Node tmp = head.next();
	         
	    }
	    
	    return false;
	}

}
