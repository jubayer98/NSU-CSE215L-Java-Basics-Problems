import java.util.Scanner;

public class prb3 
{
	public static void main(String[] args)
	{
		int[][] mat1 = new int[3][3];
		int[][] mat2 = new int[3][3];
		int[][] sum = new int[3][3];

		int i, j;
		
		Scanner stdin = new Scanner(System.in);
		
		System.out.println("Please Enter First 3x3 Matrix:");
		for(i=0; i<mat1.length; i++)
		{
			for(j=0; j<mat1[i].length; j++)
			{
				mat1[i][j] = stdin.nextInt();
			}
		}
		
		System.out.println("Please Enter Second 3x3 Matrix:");
		for(i=0; i<mat2.length; i++)
		{
			for(j=0; j<mat2[i].length; j++)
			{
				mat2[i][j] = stdin.nextInt();
			}
		}
		
		System.out.println("Summation is:");
		for(i=0; i<sum.length; i++)
		{
			for(j=0; j<sum[i].length; j++)
			{
				sum[i][j] = mat1[i][j] + mat2[i][j];
				System.out.print(sum[i][j]+"\t");
			}
			System.out.print("\n");
		}
	}
}
