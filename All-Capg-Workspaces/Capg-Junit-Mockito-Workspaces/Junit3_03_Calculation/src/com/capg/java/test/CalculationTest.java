package com.capg.java.test;

import com.capg.java.Calculation;
import junit.framework.TestCase;

public class CalculationTest extends TestCase{
	
	Calculation obj;
	
	public void setUp() {
		obj = new Calculation();
	}
	
	public void testAll() {
		
		
		assertEquals(5,obj.addition(2, 3));
		
		assertEquals(6,obj.multiplication(2, 3));
		
		assertEquals(1,obj.subtraction(2, 1));
		
		assertEquals(2,obj.division(10,5));
	}
	
	public void tearDown() {
		obj = null;
	}
}
