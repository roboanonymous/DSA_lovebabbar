import java.util.Scanner;

public class max_product {
	
	public static void maximum(int n, int[] arr)
	{
		int max= 1;
		int min = Integer.MAX_VALUE;
		for(int i=0; i<n; i++)
		{
			if(arr[i] != 0)
			{
				max = max*arr[i];
			}
			if(min > arr[i])
			{
				min = arr[i];
			}
		}
		
		if(max < 0)
		{
			max = max/ min;
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
		
		maximum(n, arr);

	}

}
