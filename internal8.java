class area1
{
	static int x,y;
	public area1()
	{
		x=y=10;
	}
	public area1(int a,int b)
	{
		x=a;
		y=b;
	}
	public static void calarea()
	{
		System.out.println(x*y);
	}
	
	public static void main(String[]  args)
	{
		area1 a1= new area1(10,20);
		a1.calarea();
		area1 a2= new area1();
		a2.calarea();
	}	
}