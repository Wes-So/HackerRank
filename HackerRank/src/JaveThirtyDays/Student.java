package JaveThirtyDays;

public class Student extends Person2{
	private int[] testScores;
	
	Student(String firstName, String lastName, int identification, int[] testScores) {
		super(firstName, lastName, identification);
		 this.testScores = testScores;
	}
	
	public char calculate(){
		int average = getAverage();
		char grade = 'T';
		
		if(average >= 90 && average <= 100){
			grade = 'O';
		} else if(average >= 80 && average < 90) {
			grade = 'E';
		} else if(average >= 70 && average < 80) {
			grade = 'A'; 
		} else if(average >= 55 && average < 70) {
			grade = 'P';
		} else if(average >= 40 && average < 55) {
			grade = 'D';
		} else if(average < 40){
			grade =  'T';
		} 
		
		return grade;
	}
	
	public int getAverage() {
		int sum = 0;
		
		for(int score : testScores){
			sum += score;
		}
		
		return sum/testScores.length;
		
		
	}

}
