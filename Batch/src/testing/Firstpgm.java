package testing;

public class Firstpgm {

	// global declaration
	
	static int x = 90;
	
	public static void main(String[] args)
	{
		/* public - access modifier
		 static - reserved keyword
		 void - return type
		 main - method name
		 String [] args - argument*/
		// Local declaration
		
		int a =10 ;
		float fl = 10.80f;
		double d = 2134.3432d;
		char c = 'x';
		String s = "Java programm";
		
		System.out.println("The Integer is :"  + a);
		System.out.println("-----------------------");
		System.out.println(fl);
		System.out.println(d);
		System.out.println(c);
		System.out.println(s);
		System.out.println(x);
		
		System.out.println(a + " , " + fl + " ,  " + d);
		
		
	}
}
