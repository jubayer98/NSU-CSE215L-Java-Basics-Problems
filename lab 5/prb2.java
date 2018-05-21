import java.util.Scanner;

public class prb2 
{
	public static void main(String[] args)
	{
		int i, j;
		int array[] = new int[10];
		
		boolean flag = false;
		
		Scanner stdin = new Scanner(System.in);
		
		System.out.println("Please Enter lenght 10 array: ");
		
		for(i=0; i<array.length; i++)
		{
			array[i] = stdin.nextInt();
		}
		
		for(j=0; j<array.length-2; j++)
		{
			if(array[j]+1 == array[j+1] && array[j+1]+1 == array[j+2])
			{
				flag = true;
			}
		}
		System.out.print(flag);
	}
}
