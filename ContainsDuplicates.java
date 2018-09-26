// Determines whether the array contains any duplicates
// Mpumelelo Mthethwa
// 26 September 2018

import java.util.TreeSet;

class ContainsDuplicates
{
	public static void main (String[] args)
	{
		int[] a = {1, 2, 3, 1},
				b = {3, 1};
		
		System.out.printf ("%s\n%s\n",containsDuplicates(a),containsDuplicates(b));
	}
	
	private static boolean containsDuplicates (int []input)
	{
		TreeSet<Integer> s = new TreeSet<Integer>();
		
		for (int i=0; i<input.length; i++)
			if (!s.add(input[i]))
				return true;
		
		return false;
	}
}

