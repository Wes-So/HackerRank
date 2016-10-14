package JaveThirtyDays;

class Difference {
	private int[] elements;
	public int maximumdifference;
	
	Difference(int[] elements){
		this.elements = elements;
		this.maximumdifference = 0;
	}
	
	void computeDifference(){ 
		for(int i = 0; i < elements.length; i ++){
			for(int j = i+1; j < elements.length; j++){
				int diff = Math.abs(elements[i] - elements[j]); 
				if(diff > maximumdifference){
					maximumdifference = diff;
				}
			} 
		}
	}

	

}
