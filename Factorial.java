package com.javacoding.basics;

import java.util.Scanner;

public class Factorial {
	public static int calculateFactorialOfNumber(int number)
	{
		int fact=1;
		for(int i=number;i>=1;i--)
		{
			fact=fact*i;
		}
		return fact;
	}
	public static void main(String args[])
	{
		int number;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		number=sc.nextInt();
		System.out.println("Factorial of "+number+" is : "+calculateFactorialOfNumber(number));
	}

}
