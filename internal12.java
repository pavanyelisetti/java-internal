class A
{
	public static void printx()
	{
	System.out.println("from class A");
	}

}
class B extends A
{
	public static void printy()
	{
	System.out.println("from class B");
	}
}
class C extends B
{
	public static void print()
	{
	System.out.println("from class c");
	}
}
class internal12
{
	public static void main(String[] args)
	{
		C c1= new C();
		c1.printx();
		c1.printy();
		c1.print();
	}
}