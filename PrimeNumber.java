package com.javacoding.basics;

import java.util.Scanner;

class Prime
{
	int number;
	public boolean isPrime()
	{
		int i;
		for(i=2;i<=number/2;i++)
		{
			if(number%i==0)
				break;
		}
		if(i==number/2+1)
			return true;
		else
			return false;
	}
}
public class PrimeNumber {
	public static void main(String args[])
	{
		Prime prime = new Prime();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		prime.number=sc.nextInt();
		if(prime.isPrime())
			System.out.println(prime.number+" is prime ");
		else
			System.out.println(prime.number+" is not prime ");
	}

}
