import java.util.*;

public class k_smallest {
	public static void ksmall(int n, int[] arr , int k)
	{
		Arrays.sort(arr);
		
		System.out.println(arr[k-1]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		System.out.println ("Enter Number : ");
		int n = sc.nextInt();
		
		System.out.println ("Enter Number k : ");
		int k = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
			
		}
		
		ksmall(n, arr, k);
	}

}
