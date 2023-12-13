package testing;

public class Methods {

	// static , non static
	// with return type or without return type
	// with or without argument
	
	public static void add()
	{
		int a,b,c;
		a=40;b=20;
		c=a+b;
		System.out.println(c);
	}
	public void sub()
	{
		int a,b,c;
		a=40;b=20;
		c=a-b;
		System.out.println(c);
	}
	
	public static int add1()
	{
		int a,b,c;
		a=40;b=20;
		c=a+b;
		return c;
	}
	
	public int square(int a,int b)
	{
		
		return a*b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		add();
		Methods ob = new Methods();
		ob.sub();
		int res = add1();
		System.out.println(res);
		int outp = ob.square(4,2);
		System.out.println(outp);
	}
	
	

}
