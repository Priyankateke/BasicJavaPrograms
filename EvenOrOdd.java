package com.javacoding.basics;

import java.util.Scanner;

public class EvenOrOdd {
	
	public static boolean checkEvenOrOdd(int number)
	{
			return number%2==0;
	}
	public static void main(String args[])
	{
		int number;
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter the number");
		number=sc.nextInt();
		
		if(checkEvenOrOdd(number))
			System.out.println("Number "+number+ " is even");
		else
			System.out.println("Number "+number+ " is odd");
	}

}
