package com.javacoding.basics;

import java.util.Scanner;
class PrimeRange
{
	int start,end;
	
	public void isPrime()
	{
		int i,j;
		for(i=start;i<=end;i++)
		{
			for(j=2;j<=i/2;j++)
			{
				if(i%j==0)
					break;
			}
			if(j==i/2+1)
				System.out.print(i+"  ");
		}
	}
}
public class PrimeNumberRange {
	public static void main(String args[])
	{
		PrimeRange prime = new PrimeRange();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range");
		prime.start=sc.nextInt();
		prime.end=sc.nextInt();
		prime.isPrime();
	}
}
