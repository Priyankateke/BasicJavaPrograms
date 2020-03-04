package com.basics.string;

import java.util.Scanner;
class Encryption
{
	String str;
	public String encryptString()
	{	
		String reverse="";
		String strArray[]=str.split(" ");
		String words[]=new String[5];
		for(int i=0;i<str.length();i++)
		{
			
		}
		for(int i=0;i<strArray.length;i++)
		{
			for(int j=strArray[i].length()-1;j>=0;j--)
			{
				reverse=reverse+strArray[i].charAt(j);
			}
			reverse=reverse+" ";
		}
		return reverse;
	}
}
public class EncryptionString {
	
	public static void main(String args[])
	{
		Encryption obj=new Encryption();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string: ");
		obj.str=sc.nextLine();
		System.out.println("Reverse of string is : "+obj.encryptString());
	}
}
