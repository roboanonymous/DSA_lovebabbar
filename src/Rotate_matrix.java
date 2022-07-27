import java.util.*;

public class Rotate_matrix {
	
	public static void rotate(int [][] matrix, int r, int c)
	{
		for(int i=0; i<r; i++)
		{
			for(int j=0; j<=i; j++)
			{
				int temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
			}
		}
		
		
		for(int i=0;i<c;++i)
        {
            for(int j=0;j<c/2;++j)
            {
                int temp =matrix[i][j];
                matrix[i][j] = matrix[i][c-j-1];
                matrix[i][c-j-1]=temp;
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
		
		rotate(matrix, r, c);
		
		for (int i = 0; i < r; i++) {
		    for (int j = 0; j < c; j++) {
		        System.out.print(matrix[i][j] + " ");
		     }
		    System.out.println();
		} 

	}

}
