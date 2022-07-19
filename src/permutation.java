import java.util.*;
public class permutation {
	
	public static void permutation1 (int n, int[] arr)
	{
		int pointer = n-2;
		int count = 0;
		int small = Integer.MAX_VALUE ,x = 0;
		
		while (arr[pointer-1] > arr[pointer] && pointer >= 0 )
		{
			count++;
			pointer--;
			
		}
		
		
		for(int i=0; i<count; i++)
		{
			if (arr[n-1-i] < small)
			{
				small = arr[n-i-1];
				x = n-i-1;
			}
		}
		
		int temp = arr[x];
		arr[x] = arr[n-1-count];
		arr[n-1-count] = temp;
		
		Arrays.sort(arr, n-count, n-1 ); 
	
		
		
		
		System.out.println (count);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println ("Enter Number : ");
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
			
		}
		
		permutation1(n,arr);
		
		for(int j=0; j<n; j++)
		{
			System.out.println(arr[j]);
		}
		

	}

}
