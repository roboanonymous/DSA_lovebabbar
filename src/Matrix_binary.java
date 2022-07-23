import java.util.*;
public class Matrix_binary {
	
	public static void binary_search(int [][] matrix , int r, int c, int k)
	{
		int i = 0 , j= c-1;
		while(r>i &&  j>=0 )
		{
			if(matrix[i][j] == k)
			{
				System.out.print("Row is " + i + " and column is " + j);
			}
			
			if(k > matrix[i][j])
			{
				i++;
			}
			
			else
			{
				j--;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println ("Enter Row : ");
		Scanner sc = new Scanner (System.in);
		int r = sc.nextInt();
		System.out.println ("Enter Column : ");
		int c = sc.nextInt();
		
		int matrix[][] = new int[r][c];
		
		
		for(int i=0; i<r; i++)
		{
			for(int j=0 ; j<c; j++)
			{
				
				matrix[i][j] = sc.nextInt();
			}
		}
		
		int k = sc.nextInt();
		
		
		
		for (int i = 0; i < r; i++) {
		    for (int j = 0; j < c; j++) {
		        System.out.print(matrix[i][j] + " ");
		     }
		    System.out.println();
		} 
		
		binary_search(matrix , r, c,k);
	}

}
