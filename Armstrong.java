package com.basicprograms;

public class Armstrong {

	public static void main(String[] args) 
	{
		int x;
		for(x=1;x<=1000;x++)
		{
			int num=x,digit=0,copy=num,rem=0;
			double sum=0;
			while(num!=0)
			{
				digit++;
				num/=10;
			}
			num=copy;
			while(num!=0)
			{
				rem=num%10;
				sum=sum+Math.pow(rem,digit);
				num/=10;
			if(sum==copy)
				System.out.println((int)sum);
			}
			
		}
	}

}
