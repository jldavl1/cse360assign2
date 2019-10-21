package cse360assign3;

import java.lang.Math;

public class Calculator extends AddingMachine
{
	public Calculator()
	{
		super();
	}
	
	public void mult(int value)
	{
		total = total * value;
		operations += " * " + value;
	}
	
	public void div(int value)
	{
		if(value == 0)
			total = 0;
		else
			total = total * value;
		operations += " / " + value;
	}
	
	public void power(int value)
	{
		if( value < 0)
			total = 0;
		else
			total = (int) Math.pow(total, value);
		operations += " ^ " + value;
	}
	
	
}