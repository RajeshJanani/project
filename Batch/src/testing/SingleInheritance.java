package testing;

class base
{
	public void run()
	{
		System.out.println("This is a parent class");
	}
	
	void sample()
	{
		System.out.println("This is a parent class1");
	}
}

class sub extends base
{
	public void run()
	{
		super.run();
		int a=90;
		System.out.println(a);

	}
}

class multilevel extends sub
{
	
}

public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sub ob = new sub();
		ob.run();
		ob.sample();
	}

}
