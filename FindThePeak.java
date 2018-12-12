// Find the peak element
// Mpumelelo Mthethwa
// 12 December 2018

import java.util.Scanner;

class FindThePeak
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner (System.in);
		System.out.printf ("Input array: ");
		String[] arr = input.nextLine().split("[, ]+");
		int[] nums = new int[arr.length];
		
		for (int i=0; i<arr.length; i++)
			nums[i] = Integer.parseInt(arr[i]);
			
		System.out.printf ("%d\n",peak (nums, 1, nums.length-2));
	}
	
	private static int peak (int[] arr, int low, int high)
	{
		if (low > high)
			return -1;
		
		if ((low < 1) || (high > arr.length-2))
			return -1;
		
		int mid = (low+high)/2;
		
		if ((arr[mid] > arr[mid-1]) && (arr[mid] > arr[mid+1]))
			return mid;
		int left = peak (arr, low, mid-1);
		
		if (left == -1)
			return peak (arr, mid+1, high);
		else
			return left;
	}
}