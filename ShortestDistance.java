// Shortest Distance
// Mpumelelo Mthethwa
// 10 Decemeber 2018

import java.util.Scanner;

class ShortestDistance
{
	public static void main (String[] args)
	{
		int T, x, y, xCount, yCount;
		Scanner input = new Scanner (System.in);
		
		// Read T value
		T = input.nextInt();
		input.nextLine();
		
		for (int i=0; i<T; i++)
		{
			xCount = yCount = 0;
			x = input.nextInt();
			y = input.nextInt();
			input.nextLine();
			
			if (x != y)
			{
				if (x > y)
				{
					while (x != y)
					{
						if (x > 1)
						{
							x /= 2;
							xCount++;
						}
						
						if (y > 1)
						{
							y /= 2;
							yCount++;
						}
					}
				}
				else
				{
					while (y != x)
					{
						if (y > 1)
						{
							y /= 2;
							yCount++;
						}
						
						if (x > 1)
						{
							x /= 2;
							xCount++;
						}
					}
				}
			}
			
			System.out.printf ("%d\n",xCount+yCount);
		}
	}
}
