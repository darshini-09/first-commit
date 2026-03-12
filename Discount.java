package com.basicprograms;

public class Discount {

	public static void main(String[] args) 
	{
		int amount=1880;
		double discount;
		if(amount>1000)
		{
			discount=amount*12.54/100;
			System.out.println("discount is"+" "+discount);
			System.out.println("Total amount ="+" "+ (amount-discount));
		}
		else
			System.out.println(0);
	}

}
