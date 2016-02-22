package cse360assign3;

/** A class which approximates a calculator, including arithmetic operations on a running total
 * As well as a method to represent the history of the operations applied to that total as a string
 * @author Kyle Chapman (PIN 212)
 */
public class Calculator{

	private int total;
	private String history;
	
	/* Creates an instance of the calculator class, initializing the running total to 0 */
	public Calculator ()
	{
		total = 0;  // not needed - included for clarity
		history = "0";
	}
	
	/* Returns the current running total
	 * @return int the current running total 
	 */
	public int getTotal ()
	{
		return total;
	}
	
	/* Adds the given int value to the running total
	 * @param value The integer value to add to the total
	 */
	public void add (int value)
	{
		total += value;
		history = history + " + " + value;
	}
	
	/* Subtracts the given int value from the running total
	 * @param value The integer value to subtract from the total
	 */
	public void subtract (int value)
	{
		total -= value;
		history = history + " - " + value;
	}
	
	/* Multiplies the running total by the given int value
	 * @param value The integer value to multiply the total by
	 */
	public void multiply (int value)
	{
		total *= value;
		history = history + " * " + value;
	}
	
	/* Divides the running total by the given int value. Rounds the the total down.
	 * @param value The integer value to divide the total by
	 */
	public void divide (int value)
	{
		if (value == 0)
		{
			total = 0;
		}
		else
		{
			total /= value;
		}
		history = history + " / " + value;
	}
	
	/* Returns a string that represents the history of operations applied to the running total
	 * @return String The string representation of the calculator's history
	 */
	public String getHistory ()
	{
		return history;
	}
}