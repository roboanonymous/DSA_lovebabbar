import java.util.*;
public class Consecutive_subsequence {
	
	public static void consecutive(int n , int[] arr)
	{
		Arrays.sort(arr);
		int count =1 , max=1;
		for(int i=0 ; i<n-1; i++)
		{
			if(arr[i+1] == arr[i]+1)
			{
				count ++;
				if(count > max)
				{
					max = count;
				}
			}
			
			else if (arr[i+1] != arr[i] && arr[i+1] != arr[i]+1)
			{
				
				count = 1;
			}
		}
		
		System.out.println(max);
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
		
		consecutive(n,arr);

	}

}
