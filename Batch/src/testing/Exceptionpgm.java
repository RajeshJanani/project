package testing;

public class Exceptionpgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		int a=10;
		int b=0;
		
		try
		{
			int c = a/b;
			System.out.println(c);
		}
		
		catch(Exception ex)
		{
			//ex.printStackTrace();
			
			//System.out.println(ex.toString());
			
			System.out.println(ex.getMessage());
		}
		
		
	}

}
