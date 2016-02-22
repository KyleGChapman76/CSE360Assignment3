package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest
{

	@Test
	public void testCalculator()
	{
		Calculator calulatorInstance = new Calculator();
		assertNotNull(calulatorInstance);
	}

	@Test
	public void testGetTotal()
	{
		Calculator calulatorInstance = new Calculator();
		assertEquals(calulatorInstance.getTotal(),0);
		calulatorInstance.add(5);
		assertEquals(calulatorInstance.getTotal(),5);
		calulatorInstance.subtract(5);
		assertEquals(calulatorInstance.getTotal(),0);
	}

	@Test
	public void testAdd()
	{
		Calculator calulatorInstance = new Calculator();
		assertEquals(calulatorInstance.getTotal(),0);
		calulatorInstance.add(5);
		assertEquals(calulatorInstance.getTotal(),5);
		calulatorInstance.add(15);
		assertEquals(calulatorInstance.getTotal(),20);
		calulatorInstance.add(-40);
		assertEquals(calulatorInstance.getTotal(),-20);
	}

	@Test
	public void testSubtract()
	{
		Calculator calulatorInstance = new Calculator();
		assertEquals(calulatorInstance.getTotal(),0);
		calulatorInstance.subtract(5);
		assertEquals(calulatorInstance.getTotal(),-5);
		calulatorInstance.subtract(15);
		assertEquals(calulatorInstance.getTotal(),-20);
		calulatorInstance.subtract(-40);
		assertEquals(calulatorInstance.getTotal(),20);
	}

	@Test
	public void testMultiply()
	{
		Calculator calulatorInstance = new Calculator();
		assertEquals(calulatorInstance.getTotal(),0);
		calulatorInstance.multiply(5);
		assertEquals(calulatorInstance.getTotal(),0);
		
		calulatorInstance.add(5);
		assertEquals(calulatorInstance.getTotal(),5);
		
		calulatorInstance.multiply(6);
		assertEquals(calulatorInstance.getTotal(),30);
		calulatorInstance.multiply(-2);
		assertEquals(calulatorInstance.getTotal(),-60);
	}

	@Test
	public void testDivide()
	{
		Calculator calulatorInstance = new Calculator();
		
		calulatorInstance.add(50);
		assertEquals(calulatorInstance.getTotal(),50);
		
		calulatorInstance.divide(5);
		assertEquals(calulatorInstance.getTotal(),10);
		calulatorInstance.divide(3);
		assertEquals(calulatorInstance.getTotal(),3);
		calulatorInstance.divide(0);
		assertEquals(calulatorInstance.getTotal(),0);
	}

	@Test
	public void testGetHistory()
	{
		fail("Not yet implemented");
	}

}
