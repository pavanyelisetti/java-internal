class A
{
	public  void print()
	{
	System.out.println("from class A");
	}

}
class B extends A
{
	public void print()
	{
	super.print();
	System.out.println("from class B");
	}
}
class C extends B
{
	public  void print()
	{
	super.print();
	System.out.println("from class c");
	}
}
class internal13
{
	public static void main(String[] args)
	{
		C c1= new C();
		c1.print();
	}
}