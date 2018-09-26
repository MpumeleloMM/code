// Find the first duplicate number for which the second occurrence has the minimal index
// Mpumelelo Mthethwa
// 26 September 2018

import java.util.TreeSet;

class FirstDuplicate
{
	public static void main (String[] args)
	{
		int[] a = {2, 1, 3, 5, 3, 2};
		System.out.println (duplicate(a));
	}
	
	private static int duplicate (int []input)
	{
		TreeSet<Integer> s = new TreeSet<Integer>();
		
		for (int i=0; i<input.length; i++)
			if (!s.add(input[i]))
				return input[i];
		
		return -1;
	}
}

