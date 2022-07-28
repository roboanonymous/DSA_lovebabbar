import java.util.*;

public class value_equal_index {
	
	public static void value(int n, int[] arr)
	{

        ArrayList<Integer> ans = new ArrayList <Integer> ();
        for(int i=0; i<n;i++)
        {
            if(arr[i] == i+1 )
            {
                ans.add(arr[i]);
            }
        }
        
        System.out.print(ans);
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
		
		value(n,arr);

	}

}
