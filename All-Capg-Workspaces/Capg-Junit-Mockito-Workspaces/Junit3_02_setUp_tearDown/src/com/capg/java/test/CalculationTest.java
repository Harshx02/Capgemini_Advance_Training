package com.capg.java.test;
import com.capg.java.Calculation;
import junit.framework.TestCase;

public class CalculationTest extends TestCase {
	
	Calculation cal1;
	
	protected void setUp() {
		cal1 = new Calculation();
	}
	
	public void testAdd() {
		int result = cal1.addition(10 , 5);
		assertEquals(15 , result);
	}
	
	protected void tearDown() {
		cal1 = null;
	}
	
}