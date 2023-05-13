class A
{
	 static int x;
	public static void printx()
	{
	System.out.println("X ="+x);
	}

}
class B extends A
{
	static int y;
	public static void printy()
	{
	System.out.println("Y ="+y);
	}
}
class internal11
{
	public static void main(String[] args)
	{
		A c1= new A();
		c1.x=10;
		c1.printx();
		B c2= new B();
		c2.x=100;
		c2.y=200;
		c2.printx();
		c2.printy();
	}
}