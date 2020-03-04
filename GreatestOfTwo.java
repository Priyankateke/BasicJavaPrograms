package com.javacoding.basics;

import java.util.Scanner;

public class GreatestOfTwo {
	public static boolean findGreatestNumber(int firstNumber,int secondNumber)
	{
		return firstNumber>secondNumber;
	}
	public static void main(String args[])
	{
		int firstNumber,secondNumber;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter two number");
		firstNumber=sc.nextInt();
		secondNumber=sc.nextInt();
		if(findGreatestNumber(firstNumber,secondNumber))
			System.out.println(firstNumber+" is greater than "+secondNumber);
		else
			System.out.println(firstNumber+" is less than "+secondNumber);
	}
}
