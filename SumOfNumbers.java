package com.javacoding.basics;

import java.util.Scanner;

public class SumOfNumbers {
	public static int calculateSum(int number)
	{
		int sum=0;
		for(int i=1;i<=number;i++)
			sum=sum+i;
		return sum;
	}
	public static void main(String args[])
	{
		int number;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		number=sc.nextInt();
		System.out.println("Sum of n natural numbers is : "+calculateSum(number));
		
	}

}
