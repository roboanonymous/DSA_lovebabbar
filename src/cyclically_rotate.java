import java.util.*;

public class cyclically_rotate {
	
	public static void rotate(int n, int[] arr)
	{
		int temp=arr[0];
		for(int i=0; i<n-1;i++)
		{
		    int temp2 = arr[i+1];
			arr[i+1] = temp;
			 temp = temp2;
		}
		arr[0] = temp;
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
		
		rotate(n,arr);
		
		for(int j=0; j<n; j++)
		{
			System.out.println(arr[j]);
		}
		
	}

}
