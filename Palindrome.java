package com.javacoding.basics;
import java.util.Scanner;
public class Palindrome {
	public static void isPalindrome(String str)
	{
		String strArray[]=str.split("");
		int index,upper;
		for(index=0,upper=strArray.length-1;index<upper;index++,upper--)
		{
			if(!strArray[index].equals(strArray[upper]))
			{
				System.out.println("string "+str+" is not palindrome ");
				break;
			}	
		}
		if(!(index<upper))
			System.out.println("string "+str+" is palindrome ");
	}
	public static void main(String args[])
	{
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string ");
		str=sc.nextLine();
		isPalindrome(str);
	}
}
