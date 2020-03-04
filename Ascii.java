package com.javacoding.basics;

import java.util.Scanner;

class AsciiValueOfChar
{
	char character;
	public int findAsciiValue()
	{
		int asciiValue=(int)character;
		return asciiValue;
	}
}
public class Ascii {
	public static void main(String args[])
	{
		AsciiValueOfChar obj=new AsciiValueOfChar();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the charcter : ");
		obj.character=sc.next().charAt(0);
		System.out.println("Ascii value of character "+obj.character+" is : "+obj.findAsciiValue());
	}
}
