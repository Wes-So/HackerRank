package JaveThirtyDays;

import org.junit.Test;

public class LinkedList {
	public static void display(Node head){
		Node start = head;
		while(start != null){
			System.out.print(start.data + " ");
			start = start.next;
		}
	}
	
	public static Node insert(Node head, int data){
        
        
		Node tail = new Node(data); //create new node
		if(head != null){
			Node start = head;
			while(start.next != null){
				start = start.next; 
			}
			start.next = tail;
			
		} else {
			head = tail;
		}
         
        
        return head;
	}
	
	 @Test
	 public void testNodeInsert(){
		 Node head = null;
		 int[] num = {2,3,4,1};
		 
		 for(int number : num){
			 head = insert(head,number);	 
		 }
		 
		 display(head);
		 
		 
		 
	 }
}
