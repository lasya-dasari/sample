package com.fb.qa.pages;

public class Patternprogram {

	public static void main(String[] args) 
	{ 
		int i, j;
		for(i=1; i<=5; i++)
		{
			for(j=i; j<=5;j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		for(int k=1;k<=i;k++)
		{
			System.out.print(" ");
		}
			
		}

	}

}
