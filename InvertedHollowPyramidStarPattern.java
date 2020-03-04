package com.javacoding.pattern;

import java.util.Scanner;

class StarPatternInvertedHollowPyramid
{
	int totalLines,line,star,space;
	public void printPattern()
	{
		for(line=totalLines;line>=1;line--)
		{
			for(space=1;space<=totalLines-line;space++)
			{
				System.out.print(" ");
			}
			for(star=1;star<=2*line-1;star++)
			{
				if(line==1 || line==totalLines || star==1 || star==2*line-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}

public class InvertedHollowPyramidStarPattern {
	public static void main(String args[])
	{
	StarPatternInvertedHollowPyramid starPattern=new StarPatternInvertedHollowPyramid();
	Scanner sc=new Scanner(System.in);
	System.out.println("How many lines of pattern you want to print");
	starPattern.totalLines=sc.nextInt();
	starPattern.printPattern();
	}

}
