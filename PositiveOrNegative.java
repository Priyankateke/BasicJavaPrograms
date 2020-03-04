package com.javacoding.basics;
import java.util.Scanner;
public class PositiveOrNegative {
	public static String checkPositiveOrNegative(int number)
	{
		if(number>0)
			return "Positive";
		else if(number<0)
			return "Negative";
		return "Zero";
			
	}
	public static void main(String args[])
	{
		int number;
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter the number");
		number=sc.nextInt();
		
		System.out.println("Number "+number+ " is : "+ checkPositiveOrNegative(number));
	}
	
}
