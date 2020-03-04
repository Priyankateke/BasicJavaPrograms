package com.javacoding.basics;

import java.util.Scanner;

public class FactorialRecursive {
	public static int calculateFactorial(int number)
	{
		if(number==0)
			return 1;
		else
		return number*(calculateFactorial(number-1));
	}
	
	public static void main(String args[])
	{
		int number,fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		number=sc.nextInt();
		System.out.println("Factorial of Number "+number+" is : "+calculateFactorial(number));
	}
}
