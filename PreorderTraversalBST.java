// Preorder Traversal BST
// Mpumelelo Mthethwa
// 10 December 2018

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class PreorderTraversalBST
{	
	public static void main (String[] args)
	{
		Integer T;
		Integer[] arr;
		BinarySearchTree<Integer> bst;
		Scanner input = new Scanner (System.in);
		
		// Read T value
		T = input.nextInt();
		input.nextLine();
		
		for (int i=0; i<T; i++)
		{
			// Create N-value array
			arr = new Integer[input.nextInt()];
			bst = new BinarySearchTree<>();
			
			input.nextLine();
			
			// Insert values into array and BST
			for (int j=0; j<arr.length; j++)
			{
				arr[j] = input.nextInt();
				bst.insert(arr[j]);
			}
			
			// Preorder array from bst
			Integer[] pre = bst.preorder().toArray(new Integer[]{});
			
			// Print result
			System.out.printf ("%d\n",(Arrays.equals(arr, pre))?1:0); 
			
			input.nextLine();			
		}
	}
}

// BST class
class BinarySearchTree<T extends Comparable<? super T>>
{
	private Node root;
	private ArrayList<T> items;
	private int size;
	
	public BinarySearchTree ()
	{
		size = 0;
	}
	
	public void insert (T item)
	{
		root = insert (item, root);
		size++;
	}
	
	private Node insert (T item, Node n)
	{
		if (n == null)
			n = new Node (item);
		else if (item.compareTo(n.data) < 0)
			n.left = insert (item, n.left);
		else if (item.compareTo(n.data) > 0)
			n.right = insert (item, n.right);
		return n;
	}
	
	public List<T> preorder ()
	{
		items = new ArrayList<>(size);
		preorder (root);
		return items;
	}
	
	private void preorder (Node n)
	{
		if (n == null)
			return;
		
		items.add (n.data);
		
		if (n.left != null)
			preorder (n.left);
		if (n.right != null)
			preorder (n.right);
	}
	
	// BST Node class
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
	}
}
