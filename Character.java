package com.javacoding.basics;

import java.util.Scanner;

class VowelOrConsonant 
{
	char character;
	
	public void findCharacterType()
	{
		if(character=='a'||character=='A'||character=='e'||character=='E'||character=='i'||character=='I'||character=='o'||character=='O'||character=='u'||character=='U')
		{
			System.out.println("Character "+character+" is vowel");
		}
		else if((character>='a' && character<='z')||(character>='A' && character<='Z' ))
			System.out.println("Character "+character+" is consonant");
		else
			System.out.println(character+" is not character ");		
	}
}

public class Character {
	public static void main(String args[])
	{
		VowelOrConsonant obj=new VowelOrConsonant();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character");
		obj.character=sc.next().charAt(0);
		obj.findCharacterType();		
	}
}
