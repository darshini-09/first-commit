package com.basicprograms;

public class Twisted {

	public static void main(String[] args) 
	{
		for(int x = 2; x <= 1000; x++)   
		{
			int c = 0;

			
			for(int y = 2; y < x; y++)
			{
				if(x % y == 0)
				{
					c++;
					break;
				}
			}

			if(c == 0) 
			{
				int rev = 0;
				int num = x;

				while(num != 0)
				{
					rev = rev * 10 + (num % 10);
					num /= 10;
				}

				int k = rev;
				int c2 = 0;

				
				for(int y = 2; y < k; y++)
				{
					if(k % y == 0)
					{
						c2++;
						break;
					}
				}

				if(c2 == 0)
				{
					System.out.println(x + " is twisted");
				}
			}
		}
	}
}