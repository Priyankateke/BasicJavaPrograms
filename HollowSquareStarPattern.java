package com.javacoding.pattern;

import java.util.Scanner;

class StarPattern
{
	int totalLines,i,j;
	public void printPattern()
	{
		for(i=1;i<=totalLines;i++)
		{
			for(j=1;j<=totalLines;j++)
			{
				if(i==1 || i==totalLines || j==1 || j==totalLines)
				{
				 System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
public class HollowSquareStarPattern {
	public static void main(String args[])
	{
		StarPattern starPattern=new StarPattern();
		Scanner sc=new Scanner(System.in);
		System.out.println("How many lines of pattern you want to print");
		starPattern.totalLines=sc.nextInt();
		starPattern.printPattern();
		
		
	}

}
