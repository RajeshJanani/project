package testing;

import java.util.Scanner;

public class Switchpgm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		
	/*	System.out.println("Enter the number 10,20,30");
		int num =sc.nextInt();
		
		switch(num)
		{
		case 10: System.out.println(" User pressed 10 ");
		break;
		case 20: System.out.println(" User pressed 20 ");
		break;
		case 30: System.out.println(" User pressed 30 ");
		break;
		default:
			System.out.println("user pressed other number");
		}*/
		
		String veg = "tomato";
		
		switch(veg)
		{
		case "tomato":
			System.out.println("buy tomato");
			break;
		case "potato":
			System.out.println("buy potato");
		
		}
		
		sc.close();
	}

}
