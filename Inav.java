package com.Testprograms;

public class Inav {

	public static void main(String[] args) 
	{
		int x=199,sum=0,num=x;
		
		while(x!=0 || sum > 9)
		{
			if(x==0)
			{
				x=sum;
				sum=0;
			}
			sum = sum+(x%10);
			x/=10;
			}
		if(sum==1)
			System.out.println(num+" "+"is"+" "+"Inav number");
		else
			System.out.println(num+" "+"is"+" "+"not inav number");
	

}
}