package cse360assign3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void testmultiply() 
	{
		Calculator a = new Calculator();
		a.mult(5);
		assertEquals(0, a.getTotal());
		a.add(7);
		a.mult(2);
		assertEquals(14, a.getTotal());
		a.mult(-3);
		assertEquals(-42, a.getTotal());
		a.mult(0);
		assertEquals(0, a.getTotal());
	}
	
	@Test
	void testdivide() 
	{
		Calculator a = new Calculator();
		a.div(5);
		assertEquals(0, a.getTotal());
		a.add(2);
		a.div(2);
		assertEquals(1, a.getTotal());
		a.div(-1);
		assertEquals(-1, a.getTotal());
		a.div(0);
		assertEquals(0, a.getTotal());
		
	}
	
	@Test
	void testpower() 
	{
		Calculator a = new Calculator();
		a.power(20);
		assertEquals(0, a.getTotal());
		a.add(2);
		a.power(2);
		assertEquals(4, a.getTotal());
		a.power(0);
		assertEquals(1, a.getTotal());
		a.power(-7);
		assertEquals(0, a.getTotal());
		
		
	}

}
