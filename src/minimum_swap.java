import java.util.*;

public class minimum_swap {
	
	public static void  min_swap(int n , int[] arr, int k)
	{
		int count=0;
		int res = Integer.MAX_VALUE;
		
		for(int i=0; i<n; i++)
		{
			if(arr[i] <= k)
			{
				count++;
			}
		}
	
		
		for(int i=0; i<= n-count; i++)
		{
			int bad = 0;
			for(int j=i; j<i+count ;j++)
			{
				if(arr[j] <= k)
				{
					bad++;
				}
			}
			
			
			res = Math.min(res, count-bad);
		}
		
		System.out.print(res);
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
		
		int k = sc.nextInt();
		min_swap(n,arr ,k);
	}

}
