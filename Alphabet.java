package com.javacoding.basics;

import java.util.Scanner;
class AlphabetCharacter
{
	char character;
	public void checkAlphabet()
	{
		if((character<='a' && character>='Z')||(character<='A'&& character>='Z'))
			System.out.println("Charcter "+character+" is alphabet ");
		else
		System.out.println("Charcter "+character+" is not alphabet ");
	}
}
public class Alphabet {
	public static void main(String args[])
	{
		AlphabetCharacter obj=new AlphabetCharacter();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the charcter : ");
		obj.character=sc.next().charAt(0);
		obj.checkAlphabet();
	}
}
