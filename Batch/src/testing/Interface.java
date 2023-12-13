package testing;

class rect implements Sample1
{
	public void drawing()
	{
		System.out.println(" Rectangle Drawing ");
	}
	
	public void inter() {
		System.out.println(" Rectangle Drawing ");
	}
}


public class Interface implements Draw

{
	public void drawing()
	{
		System.out.println(" Main Drawing ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
rect r = new rect();
r.drawing();
r.inter();

Interface i = new Interface();
i.drawing();
	}

}
