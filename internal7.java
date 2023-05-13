class cal
{
	double a,b;
	public static void add(double a,double b)
	{
		System.out.println(a+b);
	}
	public static void mul(double a,double b)
	{
		System.out.println(a*b);
	}
	public static void sub(double a,double b)
	{
		System.out.println(a-b);
	}
}
class internal7
{
	public static void main(String[] args)
	{
		cal r1 = new cal();
		r1.add(10,10);
		r1.mul(10,20);
		r1.sub(50,10);		
	}
} 