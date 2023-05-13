class mo
{
	static int x,y;
	public static void values(int a,int b)
	{
		System.out.println(a+b);
	}
	public static void values(int a)
	{
		System.out.println(a*10);
	}
	public static void values(double a,double b)
	{
		System.out.println(a+b);
	}
	public static void values(double a)
	{
		System.out.println(a+a);
	}
	
	
}
class internal10
{
	public static void main(String[] args)
	{
		mo m1 = new mo();
		m1.values(10,20);
		m1.values(5);
		m1.values(5.5,4.5);
		m1.values(3.5);
	}
}