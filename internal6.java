import java.util.Scanner;
class internal6
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int r1 = sc.nextInt();
		int c1 = sc.nextInt();
		int r2= sc.nextInt();
		int c2 = sc.nextInt();
		if(c1==r2)
		{
			int a[][] = new int[r1][c1];
			int b[][] = new int[r2][c2];
			int c[][] = new int[r2][c1];
			for(int i=0;i<r1;i++)
			{
				for(int j=0;j<c1;j++)
				{
					a[i][j]=sc.nextInt();
				}			
			}
			for(int i=0;i<r2;i++)
			{
				for(int j=0;j<c2;j++)
				{
					b[i][j]=sc.nextInt();
				}			
			}
			for(int i=0;i<r2;i++)
			{
				for(int j=0;j<c1;j++)
				{
					c[i][j]=0;
					for(int k=0;k<c1;k++)
					{
						c[i][j]=c[i][j]+a[i][k]*b[k][j];
					}
				}			
			}
			System.out.println("The matrix after multiplication is ");
			for(int i=0;i<r2;i++)
			{
				for(int j=0;j<c1;j++)
				{
					System.out.print(c[i][j]+" ");
				}			
				System.out.print("\n");
			}

		}	
		else
		{
			System.out.println("Multiplication is not possible");
		}	
	}
}
