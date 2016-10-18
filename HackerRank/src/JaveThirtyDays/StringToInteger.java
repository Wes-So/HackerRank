package JaveThirtyDays;

import org.junit.Test;

public class StringToInteger {

	private void convert(String s){
		try{
			Integer.parseInt(s);
		} catch(NumberFormatException nfe){
			System.out.println("Bad String");
		}
	}
	
	@Test
	public void testConvert(){
		convert("3");
		convert("za"); 
	}
}
