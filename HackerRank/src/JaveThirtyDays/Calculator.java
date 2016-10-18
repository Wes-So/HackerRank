package JaveThirtyDays;

public class Calculator  {
	int power(int n, int p) throws IllegalArgumentException {
		if( n < 0 || p < 0){
			throw new IllegalArgumentException("n and p should be non-negative");
		} else {
			return (int) Math.pow(n,p);
		} 
	}
}
