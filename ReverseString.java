package com.basics.string;

import java.util.Scanner;

public class ReverseString {
	public static String reverseString(String str)
	{
		String reverse="";
		for(int i=str.length()-1;i>=0;i--)
		{
			reverse=reverse+str.charAt(i);
		}
		return reverse;
	}
	public static void main(String args[])
	{
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string: ");
		str=sc.nextLine();
		System.out.println("Reverse of string is : "+reverseString(str));
	}

}
