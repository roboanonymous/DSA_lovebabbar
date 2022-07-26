import java.util.*;

public class K_element_matrix {
	
	public static void k_matrix(int [][] matrix, int r, int c)
	{
		ArrayList <Integer> list = new ArrayList <>();
		for(int i = 0; i<r; i++)
		{
			for(int j=0; j<c; j++)
			{
				list.add(matrix[i][j]);
			}
		}
		
		Collections.sort(list);
		
		System.out.println(list.get(0));
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
		
		
		k_matrix(matrix, r, c);
	}

}
