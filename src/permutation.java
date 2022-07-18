import java.util.*;
public class permutation {
	
	public static void permutation1 (int n, int[] arr)
	{
		int first = n-2, last = n-1;
		int count = 0;
		
		while (arr[first] > arr[last] && first > 0 )
		{
			count++;
			first --;
			last --;
			
		}
		
		for(int i=0; i<count; i++)
		{
			
		}
		
		System.out.println (count);
		
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
		
		permutation1(n,arr);

	}

}
