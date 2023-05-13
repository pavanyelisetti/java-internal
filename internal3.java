import java.util.Scanner;
class internal3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int s1,s2,s3,s4,s5;
		float avg;	
		s1=sc.nextInt();
		s2=sc.nextInt();
		s3=sc.nextInt();
		s4=sc.nextInt();
		s5=sc.nextInt();
		avg=(float)(s1+s2+s3+s4+s5)/5; //(float) is used to convert the value into float;
		System.out.println("the average speed="+avg);
		System.out.println("The Qualified Racers are");
		if(s1>avg)
		{
			System.out.println("s1 ="+s1);
		}
		if(s2>avg)
		{
			System.out.println("s2 ="+s2);
		}
		if(s3>avg)
		{
			System.out.println("s3 ="+s3);
		}
		if(s4>avg)
		{
			System.out.println("s4 ="+s4);
		}
		if(s5>avg)
		{
			System.out.println("s5 ="+s5);
		}
	}
}