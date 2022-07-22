import java.util.*;
public class max_ones {
	
	public static  void ones(int[][] arr, int n , int m)
	{
		int ans = 0, answer = -1;
        for(int i=0;i<n;i++)
        {
            int count = 0;
            for(int j=0; j<m; j++ )
            {
                if(arr[i][j] == 1)
                {
                    count++;
                }
                
                
            }
            
            if(count > ans)
                {
                    ans = count;
                    answer = i;
                }
        }
        
        System.out.println(answer);
        
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
		
		ones(matrix, r , c);

	}

}
