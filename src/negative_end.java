import java.util.*;
public class negative_end {
	
	public static void neg_end(int n, int[] arr)
	{
		int arr2[] = new int [n];
		int arr3[] = new int [n];
		int count = 0, count2 = 0;
		for(int k=0; k<n; k++)
		{
			if(arr[k]>= 0)
			{
				arr2[count] = arr[k];
				count++;
			}
			else
			{
				arr3[count2] = arr[k];
				count2++;
			}
		}
		
		for(int m=0; m<count;m++)
		{
			arr[m] = arr2[m];
		}
		
		for(int p=0; p<count2; p++)
		{
			arr[count+p] = arr3[p];
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
		
		neg_end(n,arr);
		
		for(int j=0; j<n; j++)
		{
			System.out.println(arr[j]);
		}
		
	}

}
