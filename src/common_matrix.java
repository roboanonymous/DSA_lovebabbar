import java.util.*;

public class common_matrix {
	
	public static void common_row(int[][] matrix, int r, int c)
	{
		HashMap <Integer, Integer> hs  = new HashMap <> ();
		
		for(int i=0; i<c; i++)
		{
			hs.put(matrix[0][i], 1);
		}

		for(int i=1; i<r; i++)
		{
			for(int j=0 ; j<c; j++)
			{
				if(hs.containsKey(matrix[i][j])  && hs.get(matrix[i][j]) == i)
				{
					hs.put(matrix[i][j], i+1);
				}
			}
		}
		
		System.out.println(hs.get(r));
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
		
		
		common_row(matrix, r, c);

	}

}
