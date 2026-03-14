package com.basicprograms;

public class CallTwice 
{
	int x=1;
	void doubleIt()
	{
		x=x*2;
	}

	public static void main(String[] args) 
	{
		CallTwice c = new CallTwice();
		c.doubleIt();
		c.doubleIt();
		c.doubleIt();
		System.out.println(c.x);
	}

}
