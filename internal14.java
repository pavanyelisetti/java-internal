interface if1
{
	void display();
}
class A implements if1
{
	
	public void display()
	{
		System.out.println("interface is implemented from class A");
	}	
}
class B extends A
{
	
	public void display()
	{
		super.display();
		System.out.println("interface is implemented from class B");
	}
}
class internal14
{
	public static void main(String[] args)
	{
		A a1=new A();
		a1.display();
		B b1 = new B();
		b1.display();
	}
}