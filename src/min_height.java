import java.util.*;

public class min_height {
	
	public static void height (int n, int [] arr , int k)
	{
		
		Arrays.sort(arr);
		
		int res = arr[n-1] - arr[0];
		for(int i=1; i<n; i++)
		{
			int max  = Math.max(arr[i-1]+k, arr[n-1]-k);
			int min = Math.min(arr[i]-k, arr[0]+k);
			
			res = Math.min(res, max - min);
		}
		
		System.out.println (res);
		
		
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
		
		height(n,arr,k);

	}

}
