import java.util.*;
public class two_pointer {
	
	public static void sort_two_point(int n , int[] arr)
	{
		int start = 0, mid = 0 , last = n-1;
		while(mid <= last)
		{
			if(arr[mid] == 0)
			{
				int temp = arr[mid];
				arr[mid] = arr[start];
				arr[start] = temp;
				start++;
				mid++;
				
			}
			
			else if(arr[mid] == 1)
			{
				mid++;
			}
			
			else
			{
				int temp = arr[mid];
				arr[mid] = arr[last];
				arr[last] = temp;
				last--;
			}
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println ("Enter Number : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
			
		}
		
		sort_two_point(n, arr);
		
		for(int j=0; j<n; j++)
		{
			System.out.println(arr[j]);
			
		}
		
	}


}
