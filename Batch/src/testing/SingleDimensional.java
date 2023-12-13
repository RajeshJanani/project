package testing;

public class SingleDimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ar[] = {1,2,3,5,7};
		
		System.out.println(ar[2]);
		System.out.println();
		
		/*for(int i=0; i<ar.length; i++)
		{
			System.out.println(ar[i]);
		}*/
		
		for(int z : ar)
		{
			System.out.println(ar[z]);
		}
	}

}
