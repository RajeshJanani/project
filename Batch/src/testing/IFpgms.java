package testing;

import java.util.Scanner;

public class IFpgms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	int x=10;
		int y=20;
		
		//if(x>y)
		if(x+y>70)
		{
			System.out.println("x+y is greater");
		}
		else
		{
			System.out.println("x+y is not greater");
		}*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Fruit name :");
		String name =sc.nextLine();
		
		if ( name == "Banana")
		{
			System.out.println("It is a Banana");
		}
		
		else if(name == "Cherry")
		{
			System.out.println("it is a Cherry");
		}
		
		else
		{
			System.out.println(name);
		}
		sc.close();
	}

}
