import java.util.Scanner;

public class dupliate_one {
	
	public static void duplicate (int n, int[] arr)
	{
		int slow = arr[0], fast = arr[0];
		
		do
		{
			slow = arr[slow];
			fast = arr[arr[fast]];
			
		} while(slow != fast);
		
		fast = arr[0];
		
		while(slow != fast)
		{
			slow = arr[slow];
			fast = arr[fast];
		}
		
		System.out.println(slow);
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
		
		duplicate(n,arr);

	}

}
