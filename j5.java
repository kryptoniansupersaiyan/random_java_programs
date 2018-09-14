
class Addition

{
	void Sum(int a,int b)
	{
		System.out.println(a+b);
	}
	void Sum(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	void min(int c,int d)
	{
		System.out.println(c-d);
	}
	void min(double c, double d)
	{
		System.out.println(c-d);
	}


	public static void main(String[]args)
	{
		Addition obj=new Addition();
		obj.Sum(10,20);
		obj.Sum(10,20,30);
		obj.min(10,20);
		obj.min(10.4,15.2);
	}
}
		