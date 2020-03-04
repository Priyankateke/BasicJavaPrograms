package com.javacoding.basics;

import java.util.Scanner;

public class GreatestOfThree {
	public static void findGreatestOfThree(int firstNumber,int secondNumber,int thirdNumber)
	{
		if(firstNumber>secondNumber && firstNumber>thirdNumber)
			System.out.println(firstNumber+" is greater");
		else if(secondNumber>firstNumber && secondNumber>thirdNumber)
			System.out.println(secondNumber+" is greater");
		else
			System.out.println(thirdNumber+" is greater");
	}
	public static void main(String args[])
	{
		int firstNumber,secondNumber,thirdNumber;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter three number");
		firstNumber=sc.nextInt();
		secondNumber=sc.nextInt();
		thirdNumber=sc.nextInt();
		findGreatestOfThree(firstNumber,secondNumber,thirdNumber);
	}
}
