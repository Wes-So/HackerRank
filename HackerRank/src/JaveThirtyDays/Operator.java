package JaveThirtyDays;

public class Operator {

    public static void main(String[] args) {

        double mealCost = 12.0;
        int tipPercent = 20;
        int taxPercent = 8;

      
        // Write your calculation code here.
        double tip = (mealCost * tipPercent) / 100; 
        double tax = mealCost * taxPercent/100;
        double gross = mealCost + tip + tax;
        // cast the result of the rounding operation to an int and save it as totalCost 
        int totalCost = (int) Math.round(gross);        
      
        // Print your result
        System.out.println("The total meal cost is " + totalCost + " dollars.");
    }
	
	
	
}
