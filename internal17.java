class internal17
{
	public static void main(String[] args)
	{
		
		String s1="abcd";
		System.out.println(s1.toUpperCase());
		String s2="ABCD";
		System.out.println(s2.toLowerCase());
		String s3 = s1.concat(s2);
		System.out.println(s3);
		String s4= "aa bb cc dd";
		System.out.println(s4.indexOf("bb"));
		System.out.println(s4.replace("dd","ee"));
		System.out.println(s4.length());
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		String s5="aabbccddee";
		System.out.println(s5.substring(2,6));
		
	}
}