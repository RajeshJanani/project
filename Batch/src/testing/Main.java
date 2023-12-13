package testing;
abstract class fruits
{
   fruits(){
	   System.out.println("consatrcutor");
   }
   
   void sample()
   {
	   System.out.println("non abstract methods");
   }
   
   abstract void names();
}

class apple extends fruits
{
	void names()
	{
		System.out.println("Apple");
	}
}


public class Main extends fruits
{
	void names()
	{
		System.out.println("Main");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		apple ap = new apple();
		ap.names();
		ap.sample();
		
		Main m = new Main();
		
		m.names();
		m.sample();
		
	}

}
