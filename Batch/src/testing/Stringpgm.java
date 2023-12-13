package testing;

public class Stringpgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="HAI HELLO";
		String s2 ="Java programming ";
		String s3 = "hai hello";
		String s4=" ";
		int c=90;
		int x =64;
		
		int len = s1.length();
		System.out.println("length is : " + len);
		
		System.out.println("lower case : " + s1.toLowerCase());
		
		String upper = s2.toUpperCase();
		System.out.println("upper case : " + upper);
		
		System.out.println("Index of char : " + s2.indexOf('J'));
		System.out.println("Index of String : " + s2.indexOf("progr"));
		
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s4.isEmpty());
		
		System.out.println("maximum " + Math.min(x, c));
		System.out.println("square root : " + Math.sqrt(c));
		
		
		
	}

}
