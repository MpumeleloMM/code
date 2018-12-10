// Shortest Distance
// Mpumelelo Mthethwa
// 10 Decemeber 2018

import java.util.Scanner;

class ShortestDistance
{
	public static void main (String[] args)
	{
		int T;
		Scanner input = new Scanner (System.in);
		
		// Read T value
		T = input.nextInt();
		input.nextLine();
		
		int[] node = new int[2],		// Input nodes
				nodeCount = new int[2];	// Edge count
		
		for (int i=0; i<T; i++)
		{
			nodeCount[0] = nodeCount[1] = 0;
			node[0] = input.nextInt();	// x
			node[1] = input.nextInt();	// y
			input.nextLine();
			
			while (node[0] != node[1])
			{				
				for (int j=0; j<2; j++)
				{
					if (node[j] != 1)
					{
						node[j] /= 2;
						nodeCount[j]++;
					}
				}
			}
			
			System.out.printf ("%d\n",nodeCount[0]+nodeCount[1]);
		}
	}
}