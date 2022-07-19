import java.util.*;
public class majority {
	
	public static void element(int n , int[] arr)
	{ 
		int k = n/3;
		HashMap <Integer, Integer> hs = new HashMap <> ();
		ArrayList <Integer> list = new ArrayList <> ();
		for(int i=0; i<n; i++)
		{
			if(hs.containsKey(arr[i]))
			{
				int old = hs.get(arr[i]);
				int ne = old+1;
				hs.put(arr[i], ne);
			}
			
			else
			{
				hs.put(arr[i], 1);
			}
		}
		
		System.out.println(Arrays.asList(hs));
		
		for(int j=k; j<n; j++)
		{
			list.add(1);
		}
		
		
		System.out.println(list);
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
		
		
		
		element(n,arr);
		
		
	}

}
