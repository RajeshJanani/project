package testing;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String address ="bangalore, Tamilnadu";
		
		if(address.endsWith("Karnataka"))
		{
		if(address.contains("Mysore"))
		{
			System.out.println("city is mysore");
		}
		else if(address.contains("chennai"))
		{
			System.out.println("city is chennai");
		}
		else
		{
			System.out.println(address.split(",")[0]);
		}
		
		
		}
		else
		{
		System.out.println("u are not in karnataka");		
		}
		
	}

}
