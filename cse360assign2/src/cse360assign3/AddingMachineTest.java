package cse360assign3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddingMachineTest {

	@Test
	void testadd() 
	{
		AddingMachine a = new AddingMachine();
		a.add(5);
		assertEquals(5, a.getTotal());
		a.add(7);
		assertEquals(12, a.getTotal());
		a.add(-5);
		assertEquals(7, a.getTotal());
	}
	
	@Test
	void testSubtract() 
	{
		AddingMachine a = new AddingMachine();
		a.subtract(5);
		assertEquals(-5, a.getTotal());
		a.subtract(2);
		assertEquals(-7, a.getTotal());
		a.subtract(-7);
		assertEquals(0, a.getTotal());
		
	}
	
	@Test
	void testString() 
	{
		AddingMachine a = new AddingMachine();
		a.add(5);
		a.add(7);
		a.add(-5);
		a.subtract(7);
		a.subtract(3);
		assertEquals("0 + 5 + 7 + -5 - 7 - 3", a.toString());
		a.clear();
		assertEquals("0", a.toString());
		
	}

}
