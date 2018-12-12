// Print nodes at k distance from root
// Mpumelelo Mthethwa
// 11 December 2018

import java.util.Scanner;

class PrintK
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner (System.in);
		System.out.printf ("Input array: ");
		String[] arr = input.nextLine().split("[, ]+");
		BinaryTree<String> bt = new BinaryTree<>();
		
		for (int i=0; i<arr.length; i++)
			bt.insert(arr[i]);
		
		System.out.printf ("k: ");
		int k = Integer.parseInt (input.nextLine());
		bt.printk(k);
	}
}

// Binary Tree class
class BinaryTree<T extends Comparable<? super T>>
{	
	private Node root;
	private int depth, size;
	
	public BinaryTree ()
	{
		depth = size = 0;
	}
	
	public void insert (T item)
	{
		root = insert (size, 0, root, item);
		depth = (int)log(size+1, 2);
	}
	
	private Node insert (int s, int d, Node n, T item)
	{
		if (d == depth)
		{
			if ((s == size) && (n == null))
			{
				n = new Node (item);
				size++;
			}
		}
		else
		{
			n.left = insert (s, d+1, n.left, item);
			n.right = insert (s, d+1, n.right, item);
		}
		
		return n;
	}
	
	private double log (double x, double b)
	{
		return Math.log(x)/Math.log(b);
	}
	
	public void printk (int k)
	{
		printk (root, 0, k);
	}
	
	private void printk (Node n, int d, int k)
	{
		if (n != null)
		{
			if (k == d)
				System.out.printf ("%s ",n);
			else
			{
				printk (n.left, d+1, k);
				printk (n.right, d+1, k);
			}
		}
	}
	
	// BT Node class
	private class Node
	{
		private T data;
		private Node left, right;
		
		// Default constructor
		public Node ()
		{
			this (null);
		}
		
		// Constructor with no children
		public Node (T data)
		{
			this (data, null, null);
		}
		
		// Full constructor
		private Node (T data, Node left, Node right)
		{
			this.data = data;
			this.left = left;
			this.right = right;
		}
		
		// To String
		public String toString ()
		{
			return data.toString();
		}
	}
}
