/**
 *@Author Jorge_Davila

 * Class ID: 70642
 * This program is an extension of adding machine with the ability to multiply divide and do exponents 
 */
package cse360assign3;

import java.lang.Math;

public class Calculator extends AddingMachine
{
	/**
	 * default constructor
	 */
	public Calculator()
	{
		super();
	}
	
	
	/**
	 * multiplies the total by the given value.
	 * @param value that you want to multiply by
	 */
	public void mult(int value)
	{
		total = total * value;
		operations += " * " + value;
	}
	
	/**
	 * divides the total by a given value
	 * @param value which you want to divide the total by.
	 */
	public void div(int value)
	{
		if(value == 0)
			total = 0;
		else
			total = total * value;
		operations += " / " + value;
	}
	
	/**
	 * raise the total to the power of a value 
	 * @param value that you want to raise the total to.
	 */
	public void power(int value)
	{
		if( value < 0)
			total = 0;
		else
			total = (int) Math.pow(total, value);
		operations += " ^ " + value;
	}
	
	
}