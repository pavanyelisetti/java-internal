import java.util.Scanner;
abstract class ab 
{
	public abstract void input();
	public abstract void area();
	Scanner sc = new Scanner(System.in);
	
}
class rect extends ab
{
	int l,b;
	public void input()
	{
		l=sc.nextInt();
		b=sc.nextInt();
	}
	public void area()
	{
		System.out.println("The area of rectangle is"+l*b);
	}
}
class circle extends ab
{	
	int r;
	public  void input()
	{
		r=sc.nextInt();
	}
	public  void area()
	{
		System.out.println("The area of circle is"+3.14*r*r);
	}
}
class tri extends ab
{
	int ba,h;
	public  void input()
	{
		ba=sc.nextInt();
		h=sc.nextInt();
	}
	public void area()
	{
		System.out.println("The area of triangle is"+0.5*ba*h);
	}
}
class internal16
{
	public static void main(String args[]) throws Exception
	{
		rect r1 =new rect();
		r1.input();
		r1.area();
		
		circle c1 = new circle();
		c1.input();
		c1.area();
		
		tri t1=new tri();
		t1.input();
		t1.area();
	}
}