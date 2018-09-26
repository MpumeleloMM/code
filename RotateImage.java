// Given an n x n 2D matrix that represents an image. Rotate the image by 90 degrees (clockwise)
// Mpumelelo Mthethwa
// 26 September 2018

import java.util.Arrays;

class RotateImage
{
	public static void main (String[] args)
	{
		int[][] a = {{1,2,3},{4,5,6},{7,8,9}},
				  b= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		System.out.printf("[%s]\n",rotateImage(a));
	}
	
	private static String rotateImage (int[][] input)
	{
		int[][] result = new int[input.length][input.length];
		String resultStr = "";
		
		for (int i=0; i<input.length; i++)
			for (int j=0; j<input.length; j++)
				result[j][input.length-i-1] = input[i][j];
		
		for (int i=0; i<result.length; i++)
			resultStr += Arrays.toString(result[i]) + ((i < result.length-1)?", ":"");
		
		return resultStr;
	}
}