import java.util.Scanner;

public class max_product {
	
	public static void maximum(int n, int[] arr)
	{
		int curr = 1, max= 0;
		for(int i=0; i<n; i++)
		{
			curr = curr* arr[i];
			if(max < curr)
			{
				max = curr;
			}
			
			if (curr == 0)
			{
				curr = 1;
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
		
		maximum(n, arr);

	}

}
