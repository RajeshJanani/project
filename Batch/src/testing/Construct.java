package testing;

public class Construct {

	int x;
	
	Construct()
	{
		System.out.println("no args constructor");
	}
	
	Construct (int y)
	{
		x=y;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Construct c = new Construct();
		Construct c1 = new Construct(10);
		System.out.println(c1.x);
	}

}
