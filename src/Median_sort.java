import java.util.Arrays;
import java.util.Scanner;

public class Median_sort {
	
	public static void median (int n , int m , int[] arr, int [] arr2)
	{
		int start = 0 ;
		while (start< n)
		{
			if(arr[start] > arr2[0])
			{
				int temp = arr[start];
				arr[start] = arr2[0];
				arr2[0] = temp;
				
				
			}
			
			start++;
			Arrays.sort(arr);
			Arrays.sort(arr2);
			
		}
		
		int x = arr[n-1] + arr2[0];
		System.out.println(x);
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
		
		System.out.println ("Enter Number : ");
		int n2 = sc.nextInt();
		int arr2[] = new int[n2];
		
		for(int i=0; i<n2; i++)
		{
			arr2[i] = sc.nextInt();
			
		}
		
		median(n,n2,arr,arr2);
		
		
	}

}
