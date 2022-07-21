import java.util.Scanner;

public class product_subarray {
	
	public static void product(int n, int[] arr)
	{
		int curr= 1 , max = 1;
		for(int i=0; i<n; i++)
		{
			if(arr[i] == 0)
			{
				curr = 1;
				continue;
			}
			curr= curr * arr[i];
			if(max < curr)
			{
				max = curr;
			}
			
			
		}
		
		System.out.print(max);
		
		
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
		
		product(n, arr);

	}

}
