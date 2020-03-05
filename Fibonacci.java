package com.basics.test;
class FibonacciIndex {
	int first,second,result=0;
	int numbers[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
	public void printFibonacciIndex()
	{
		System.out.print(numbers[first]+" ");
		System.out.print(numbers[second]+" ");
		for(int index=0;index<numbers.length;index++)
		{
			result=first+second;
			if(result>numbers.length-1)
				break;
			System.out.print(numbers[result]+" ");
			first=second;
			second=result;
		}
	}
}
public class Fibonacci {
	public static void main(String args[])
	{
		FibonacciIndex fibo=new FibonacciIndex();
		fibo.first=0;
		fibo.second=1;
		int numbers[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		fibo.printFibonacciIndex();
	}
}

/*
 1 2 2 3 4 6 9 14 */
