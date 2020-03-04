package com.javacoding.basics;

import java.util.Scanner;

public class PalindromeNumber {
	public static String calculateSumOfDigits(int number)
	{
		int r,sum=0;
		String reverse="";
		while(number>=1)
		{
			r=number%10;
			reverse=reverse+Integer.toString(r);
			number=number/10;
		}
		return reverse;
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
