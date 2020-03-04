package com.javacoding.pattern;

import java.util.Scanner;
class StarPatternRect
{
	int totalLines,line,star,space;
	public void printPattern()
	{
		for(line=1;line<=totalLines;line++)
		{
			
			for(star=1;star<=totalLines+2;star++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}


public class RectangleStarPattern {
	public static void main(String args[])
	{
		StarPatternRect starPattern=new StarPatternRect();
		Scanner sc=new Scanner(System.in);
		System.out.println("How many lines of pattern you want to print");
		starPattern.totalLines=sc.nextInt();
		starPattern.printPattern();
	}

}
