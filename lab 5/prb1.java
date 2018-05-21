import java.util.Scanner;

public class prb1 
{
	public static void main(String[] args)
	{
		int[] myList = new int[10];
		Scanner stdin = new Scanner(System.in);
		
		int i = 0;
		int max = 0;
		
		System.out.println("Please Enter Ten Integers below:");
		for(i=0; i<10; i++)
		{
			myList[i] = stdin.nextInt();
		}
		for(i=0; i<10; i++)
		{
			if(myList[i] > max)
			{
				max = myList[i];
				
			}
		}
		System.out.println("The largest number is " + max);
	}
}