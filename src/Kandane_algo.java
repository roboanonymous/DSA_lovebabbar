import java.util.*;
public class Kandane_algo {
	
	public static void kandane (int n, int[] arr)
	{
		int curr= 0 , max = 0;
		for(int i=0; i<n; i++)
		{
			curr= curr+ arr[i];
			if(max < curr)
			{
				max = curr;
			}
			
			if(curr < 0)
			{
				curr = 0;
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
		
		kandane(n, arr);

	}

}
