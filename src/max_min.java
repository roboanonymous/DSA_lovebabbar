import java.util.*;
public class max_min {
	
	public static void maximum_min(int n, int[] arr)
	{
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int j=0; j<n ;j++)
		{
			if (arr[j] > max)
			{
				max = arr[j];
			}
			
			if (arr[j] < min)
			{
				min = arr[j];
			}
		}
		
		System.out.println(max);
		System.out.println(min);
	}

	public static void main(String[] args) {
		
		System.out.println ("Enter Number : ");
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
			
		}
		
		maximum_min(n, arr);

	}

}
