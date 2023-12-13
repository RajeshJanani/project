package testing;

public class Methoverload {

	int a;
	public void add()
	{
		int a=90,b=80,c;
		c=a+b;
		System.out.println(c);
	}
	
	static int add(int a)
	{
		
		int b=80,c;
		c=a+b;
		return c;
	}
	
	int add(int a, int b)
	{
		this.a=a;
		int c=a+b;
		return c;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Methoverload me = new Methoverload();
		me.add();
		int ans = add(10);
		System.out.println(ans);
		int out = me.add(10, 20);
		System.out.println(out);
	}

}
