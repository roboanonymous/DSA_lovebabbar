import java.util.*;
public class reverse_array {
	
	public static void reverse_array(int n , int[] arr)
	{
		for(int k=0; k<n/2; k++)
		{
			int temp = arr[k];
			arr[k] = arr[n-1-k];
			arr[n-1-k] = temp;
		}
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
		
		reverse_array(n,arr);
		
		for(int j=0; j<n; j++)
		{
			System.out.println(arr[j]);
		}
		
	}

}
