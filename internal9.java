class add
{
	public add()
	{
		System.out.println(10*10);
	}
	public add(int a,int b)
	{
		System.out.println(a+b);
	}
	public add(int a,double b)
	{
		System.out.println(a+b);
	}
	public add(double a,int b)
	{
		System.out.println(a+b);
	}
	public add(double a,double b)
	{
		System.out.println(a+b);
	}
}
class internal9
{
	public static void main(String[] args)
	{
		add a1= new add(10,20);
		add a2=new add();
		add a3=new add(10,11.5);
		add a4=new add(5.6,6);
		add a5=new add(4.5,5.5);	
	}
}