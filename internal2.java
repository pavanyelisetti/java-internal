import java.util.*;
class internal2
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		double a= sc.nextFloat();
		double b= sc.nextFloat();
		double c= sc.nextFloat();
		double d=(b*b)-(4*a*c);
		double root1,root2;
		if(d>0)
		{
			System.out.println("roots are real");
			root1=-b+(Math.sqrt(d)/(2.0*a));
			root2=-b-(Math.sqrt(d)/(2.0*a));
			System.out.println("root1 ="+root1+"\nroot2 ="+root2);
		}
		else if(d==0)
		{
			System.out.println("roots are equal");
			root1=root2=-b/(2.0*a);
			System.out.println("root1 ="+root1+"\nroot2 ="+root2);
		}
		else
		{
			System.out.println("roots are imaginary");
			double real=-b/(2.0*a);
			double imag= (Math.sqrt(-d)/(2.0*a));
			System.out.println("root1 ="+real+"+"+imag+"i");
			System.out.println("root2 ="+real+"-"+imag+"i");
			
			
		}
	}
}