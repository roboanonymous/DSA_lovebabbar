import java.util.*;
public class rain_water {
	
	public static void rain(int n, int[] arr)
	{
		int left[] = new int [n] , max = 0;
		int right[] = new int [n] , max2 = 0;
		int sum =0;
		
		for(int i=0; i<n; i++)
		{
			if(max < arr[i])
			{
				max = arr[i];
			}
			left[i] = max;
		}
		
		for (int j = n-1; j>=0; j--)
		{
			if(max2 < arr[j])
			{
				max2 = arr[j];
			}
			right[j] = max;
		}
		
		for(int k =0; k<n; k++)
		{
			if(left[k] >= right[k])
			{
				sum = sum + (right[k] - arr[k]);
			}
			
			else
			{
				sum = sum + (left[k] - arr[k]);
			}
		}
		
		System.out.println(sum);
		
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
		
		rain(n,arr);
		
		
	}

}
