package com.javacoding.pattern;
import java.util.*;
import java.io.*;
public class SquareStarPattern {
	public static void main(String args[])
	{
	int totalLines;
	Scanner sc=new Scanner(System.in);
	System.out.println("How many lines of pattern you want to print");
	totalLines=sc.nextInt();
	
	for(int i=1;i<=totalLines;i++)
	{
		for(int j=1;j<=totalLines;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	}

}
