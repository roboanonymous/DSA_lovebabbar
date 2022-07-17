import java.util.*;
public class Merge_array {
	
	public static void merge(int [][] intervals)
	{
		int n = intervals[0].length;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println ("Enter Number : ");
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int arr[][] = new int[n][2];
		
		for(int i=0; i<n; i++)
		{
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		
		merge(arr);

		 System.out.println(Arrays.deepToString(arr));
	}

}
