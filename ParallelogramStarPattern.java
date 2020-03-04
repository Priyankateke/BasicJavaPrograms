package com.javacoding.pattern;

import java.util.Scanner;

class StarPatternParallel
{
	int totalLines,line,star,space;
	public void printPattern()
	{
		for(line=1;line<=totalLines;line++)
		{
			for(space=1;space<line;space++)
			{
				System.out.print(" ");
			}
			for(star=1;star<=totalLines+2;star++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

public class ParallelogramStarPattern {
	public static void main(String args[])
	{
		StarPatternParallel starPattern=new StarPatternParallel();
		Scanner sc=new Scanner(System.in);
		System.out.println("How many lines of pattern you want to print");
		starPattern.totalLines=sc.nextInt();
		starPattern.printPattern();
	}



}
