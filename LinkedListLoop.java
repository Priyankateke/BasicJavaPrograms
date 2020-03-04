package com.javacoding.basics;
class Node
{
	int data;
	Node next;
}

class LinkedList
{
	Node head;
	public void add(int data)
	{
		Node newNode=new Node();
		newNode.data=data;
		newNode.next=null;
		
		if(head==null)
			head=newNode;
		else
		{
			Node current=head;
			while(current.next!=null)
			{
				current=current.next;
			}
			current.next=newNode;
		}
	}
	
	public void display()
	{
		Node current=head;
		while(current.next!=null)
		{
			System.out.println(current.data);
			current=current.next;
		}
		System.out.println(current.data);
	}

	/*public void createLoop()
	{
		Node current=head;
		while(current.next!=null)
		{
			current=current.next;
		}
		
	}*/
	
	public void isLoopPresent()
	{
		Node current=head;
		while(current.next!=null)
		{
			current=current.next;
		}
		
	}
}
public class LinkedListLoop {
	public static void main(String args[])
	{
		LinkedList list=new LinkedList();
		list.add(5);
		list.add(3);
		list.add(7);
		list.add(10);
		list.add(15);
		list.display();
		//list.createLoop();
		list.isLoopPresent();
	}

}
