package testing;

public class Recursion {

	static int x=0;
	
	static void rec()
	{
		x++;
		if(x<=5)
		{
			System.out.println(x);
			rec();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		rec();
	}

}
