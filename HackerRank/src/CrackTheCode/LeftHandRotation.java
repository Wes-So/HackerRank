package CrackTheCode;

import java.util.ArrayList;

public class LeftHandRotation {

	   public static int[] arrayLeftRotation(int[] a, int n, int k) {
	    	
	    	ArrayList<Integer> arList = convertToArrayList(a,n); 
	    	
	    	
	    	
	    	for(int i = 0; i < k; i++){
	        	int rem = arList.remove(0);
	        	arList.add(rem);
	    	}
	    	 
	    	
	      return convertToIntArray(arList,n) ;
	    }
	    
	    private static int[] convertToIntArray(ArrayList<Integer> arList, int n){
	    	int[] a = new int[n];
	    	for(int i = 0; i < n; i++){
	    		a[i] = arList.get(i);
	    	}
	    	
	    	return a;
	    }
	    
	    private static ArrayList<Integer> convertToArrayList(int[] a, int n){
	    	ArrayList<Integer> arList = new ArrayList<Integer>();
	    	for(int i = 0; i < n; i++){
	    		arList.add(a[i]);	
	    	}
	    	 
	    	return arList;
	    }
	
}
