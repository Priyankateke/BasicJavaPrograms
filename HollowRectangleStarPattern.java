package com.javacoding.pattern;

import java.util.Scanner;
class StarPatternHollow
{
	int totalLines,line,star,space;
	public void printPattern()
	{
		
		for(line=1;line<=totalLines;line++)
		{
			for(star=1;star<=totalLines+2;star++)
			{
				if(line==1 || line==totalLines || star==1 || star==totalLines+2)
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

public class HollowRectangleStarPattern {
	public static void main(String args[])
	{
		StarPatternHollow starPattern=new StarPatternHollow();
		Scanner sc=new Scanner(System.in);
		System.out.println("How many lines of pattern you want to print");
		starPattern.totalLines=sc.nextInt();
		starPattern.printPattern();
	}


}
