import java.util.*;

public class union_array {
	
	public static void union(int n, int[] a, int m, int[] b)
	{
		Set <Integer> hs = new HashSet <>();
		for(int i=0; i<n; i++)
		{
			hs.add(a[i]);
		}
		
		for(int i=0; i<m; i++)
		{
			hs.add(b[i]);
		}
		
		System.out.println(hs.size());
		
		
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
		
		for(int j=0; j<n2; j++)
		{
			arr2[j] = sc.nextInt();
			
		}
		
		union(n, arr, n2, arr2);


	}

}
