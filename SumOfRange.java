package com.javacoding.basics;

import java.util.Scanner;

public class SumOfRange {
	public static int calculateSum(int lower,int upper)
	{
		int sum=0;
		for(int i=lower;i<=upper;i++)
			sum=sum+i;
		return sum;
	}
	public static void main(String args[])
	{
		int lower,upper;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range");
		lower=sc.nextInt();
		upper=sc.nextInt();
		System.out.println("Sum of natural numbers between  "+lower+" and "+upper+" is : "+calculateSum(lower,upper));
		
	}
}
