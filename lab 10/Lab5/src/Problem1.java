
public class Problem1 {

	
	public static void main(String[] args) {
		int [] array={87,68,94,100,83,78,78,85,91,76,87};
		int total=0;
		
		for(int Counter = 0;Counter < array.length;Counter++)
			total+=array[Counter];
		System.out.printf("Total of array elements :%d\n",total);

	}

}
