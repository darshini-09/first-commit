package com.Testprograms;

public class Phone 
{
	int price;
	void show()
	{
		System.out.println(price);
	}

	public static void main(String[] args) 
	{
		Phone p1 = new Phone();
		Phone p2 = new Phone();
		p1.price = 999;
		p1.show();
		p2.show();
	}

}
