import java.util.*;

public class sorted_matrix {
	
	public static void sorted(int [][] matrix, int N)
	{
	     ArrayList<Integer>l=new ArrayList<>();
	        
	        for(int i=0;i<N;i++)
	        {
	            for(int j=0;j<N;j++)
	            {
	                l.add(matrix[i][j]);
	            }
	        }
	        Collections.sort(l);
	        
	        int k=0;
	        for(int i=0;i<N;i++)
	        {
	            for(int j=0;j<N;j++)
	            {
	                matrix[i][j]=l.get(k++);
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
		
		sorted(matrix, r);
		
		for (int i = 0; i < r; i++) {
		    for (int j = 0; j < c; j++) {
		        System.out.print(matrix[i][j] + " ");
		     }
		    System.out.println();
		} 

	}

}
