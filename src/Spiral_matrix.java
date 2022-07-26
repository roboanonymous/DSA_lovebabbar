import java.util.*;

public class Spiral_matrix {
	
	public static void spiral(int[][] matrix, int r, int c)
	{
		ArrayList <Integer> list = new ArrayList <>();
		
		int top =0, left =0, down = r-1, right = c-1;
		int dir = 0;
		while(top <= down && left <= right)
		{
			if (dir == 0)
			{
				for(int i=left ;i<=right; i++)
				{
					list.add(matrix[top][i]);
				}
				
				top++;
			}
			
			if (dir == 1)
			{
				for(int i=top ;i<=down; i++)
				{
					list.add(matrix[i][right]);
				}
				
				right--;
			}
			
			if (dir == 2)
			{
				
				for(int i=right ;i>= left; i--)
				{
					list.add(matrix[down][i]);
				}
				
				down--;
			}
			
			if (dir == 3)
			{
				for(int i=down ;i>=top; i--)
				{
					list.add(matrix[i][left]);
				}
				
				left++;
			}

			dir = (dir+ 1)%4;
		}
		
		
		System.out.print(list);
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
		
		spiral(matrix, r, c);
	}

}
