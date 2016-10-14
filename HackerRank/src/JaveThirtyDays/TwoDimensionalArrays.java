package JaveThirtyDays;

import org.junit.Test;

public class TwoDimensionalArrays {
	
	
	private int[][] generateTestData(int counter){
		int[][] data = new int[counter][counter];
		for(int i = 0; i < counter; i++){
			for(int j = 0; j < counter; j++){
				data[i][j] = i + j;
			}
		}
		
		return data;
	}

	private void printData(int[][] data,int counter){
		
		for(int i = 0; i < counter; i++){
			for(int j = 0; j < counter; j++){
				System.out.print(data[i][j]);
			}
			System.out.println("");
		}
		
		
	}
	
	@Test
	public void testComputeHourGlass(){
 		int data[][] = generateTestData(6);
		printData(data, 6);
		System.out.println("#######");
		int biggest = 0;		
		for(int i = 0; i < 4; i++) { // top
			for(int j = 0; j < 4; j++) {
				int total = data[i][j] +data[i][j+ 1] +data[i][j +2];
				total = total + data[i + 1][j + 1];
				total = total + data[i+2][j] + data[i+2][j +1] + data[i+2][j + 2];	
				if(total > biggest){
					biggest = total;
				} 
			}
		}
		
		System.out.println(biggest); 
	}
	
}
