package com.javacoding.pattern;

import java.util.Scanner;

class StarPatternPyramid
{
	int totalLines,line,star,space;
	public void printPattern()
	{
		for(line=1;line<=totalLines;line++)
		{
			for(space=1;space<=totalLines-line;space++)
			{
				System.out.print(" ");
			}
			for(star=1;star<=2*line-1;star++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

public class PyramidStarPattern {
	public static void main(String args[])
	{
		StarPatternPyramid starPattern=new StarPatternPyramid();
		Scanner sc=new Scanner(System.in);
		System.out.println("How many lines of pattern you want to print");
		starPattern.totalLines=sc.nextInt();
		starPattern.printPattern();
	}
}
