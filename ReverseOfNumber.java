package com.javacoding.basics;

import java.util.Scanner;

public class ReverseOfNumber {

	public static int calculateSumOfDigits(int number)
	{
		int r,sum=0;
		while(number>=1)
		{
			r=number%10;
			sum=sum+r;
			number=number/10;
		}
		return sum;
	}
	
	public static void main(String args[])
	{
		int number;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		number=sc.nextInt();
		System.out.println("Reverse of Number "+number+" is : "+calculateSumOfDigits(number));
	}


}
