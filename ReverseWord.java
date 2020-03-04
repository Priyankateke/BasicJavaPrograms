package com.basics.string;

import java.util.Scanner;

public class ReverseWord {
	public static String reverseString(String str)
	{	
		String reverse="";
		String strArray[]=str.split(" ");
		for(int i=0;i<strArray.length;i++)
		{
			//System.out.println(strArray[i]);
			for(int j=strArray[i].length()-1;j>=0;j--)
			{
				reverse=reverse+strArray[i].charAt(j);
			}
			reverse=reverse+" ";
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
