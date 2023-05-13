import java.util.*;
class internal4
{
 	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n,v=0;
		n=sc.nextInt();
		int a[]= new int[n];
		System.out.println("Enter the elements in Ascending order");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int se=sc.nextInt();
		int l=0,h=n-1,mid;
		while(l<=h)
		{
			mid=(l+h)/2;
			if(a[mid]==se)
			{
				System.out.println("element found at index"+mid);
				v=1;
				break;
			}	
			else if(a[mid]<se)
			{
				l=mid+1;
			}
			else
			{
				h=mid-1;
			}
		}
		if(v==0)
		{
			System.out.println("Element not found");

			}

	}
}
