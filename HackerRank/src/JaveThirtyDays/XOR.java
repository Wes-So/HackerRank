package JaveThirtyDays;

import org.junit.Test;

public class XOR {
	
	
    static int maxXor(int l, int r) {
    	int maxNumber = 0;
    	int ans = 0;
        for(int i = l; i < r; i++){        	
        	for(int j = l; j <= r ; j++){
        		ans = i^j;
        		if(ans > maxNumber) maxNumber = ans;
        	}
        }
        
        ans = r^r;
        if(ans> maxNumber){
        	maxNumber = ans;
        }
        
        return maxNumber;

    }
    
    @Test
    public void testMaxXor(){
    	System.out.println(maxXor(10,15));
    }

}
