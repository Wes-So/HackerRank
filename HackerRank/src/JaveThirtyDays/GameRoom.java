package JaveThirtyDays;

import org.junit.Test;

public class GameRoom {
	
	@Test
	public void testCompute(){
		int[] data = {1,2,5};
		Difference difference = new Difference(data);
		difference.computeDifference();
		System.out.println(difference.maximumdifference);
	}
}
