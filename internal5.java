import java.util.Scanner;
class internal5
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		int temp;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();	
		}
		System.out.println("The elements are");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				if(a[j]>a[j+1])
				{	
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("The elements after sorting are ");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]+" ");
		}
	}
}