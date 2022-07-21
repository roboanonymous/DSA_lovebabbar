import java.util.*;
public class pos_neg {
	public static void positive_neg(int n , int [] arr)
	{
		ArrayList <Integer> pos = new ArrayList <> (); 
		ArrayList <Integer> neg = new ArrayList <> (); 
		
		for(int i=0; i<n; i++)
		{
			if (arr[i] < 0)
			{
				neg.add(arr[i]);
			}
			
			else
			{
				pos.add(arr[i]);
			}
			
		}
		
		for
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
		
		positive_neg(n,arr);
		
		for(int j=0; j<n; j++)
		{
			System.out.println(arr[j]);
		}


	}

}
