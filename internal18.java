class internal18
{
	public static void main(String[] args)
	{
		StringBuffer s1=new StringBuffer("hello");
		StringBuffer s2 = new StringBuffer("world");
		s1.append(",");
		s1.append(s2);
		System.out.println(s1);
		s1.insert(6,"there");
		System.out.println(s1);
		s1.delete(6,12);
		System.out.println(s1);
		s1.reverse();
		System.out.println(s1);
		s1.setLength(5);
		System.out.println(s1);
		
	}
}