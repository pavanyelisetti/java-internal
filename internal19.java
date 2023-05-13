class internal19
{
	public static void main(String[] args)
	{
		int a[]={10,20,30};
		try
		{
			for(int i=0;i<4;i++)
			{
				System.out.println(a[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e)	
		{
			System.out.println("index reached bounds");
		}
		System.out.println("task completed");
	}
}