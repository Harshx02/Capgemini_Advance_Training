package com.capg.java;

import junit.framework.TestCase;

public class CalculationTest extends TestCase{
	public void testAdd() {
		//way 1
		Calculation cal1 = new Calculation();
		int result = cal1.addition(2,3);
				assertEquals(5,result);
		
		//way 2 
		assertEquals(5,new Calculation().addition(2,3));
		assertEquals(10,new Calculation().subtraction(15,5));
		assertEquals(4,new Calculation().multiplication(2,2));
		
	}
}

