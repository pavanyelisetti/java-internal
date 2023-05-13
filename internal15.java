class A
{
	public void show()
	{
		System.out.println("From class a");
	}
}
class B extends A
{
	public void show()
	{
		System.out.println("from class b");
	}
}
class C extends A
{
	public void show()
	{
		System.out.println("from class c");
	}
}
class internal15
{
	public static void main(String[] args)
	{
		A a;
		a=new A();
		a.show();
		a=new B();
		a.show();
		a=new C();
		a.show();
	}
}