package cse360assign2;

public class AddingMachine 
{
	private int total;
	private String operations = "0";
	
	public AddingMachine () 
	{
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * 
	 * @return the current total
	 */
	public int getTotal () 
	{
		return 0;
	}
	
	/**
	 * This method adds a given value to the total.
	 * @param value that should be added to the total
	 */
	public void add (int value) 
	{
		
	}
	
	/**
	 * This method subtracts a given number from the total.
	 * @param value that should be subtracted from the total.
	 */
	public void subtract (int value) 
	{
		
	}
	
	/**
	* 
	* @return all operation performed to the total.
	*/
	public String toString () 
	{
		return operations;
	}
	
	/**
	 * this method clears the total and all operations performed.
	 */
	public void clear() 
	{
		
	}

}