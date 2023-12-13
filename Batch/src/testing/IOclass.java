package testing;

import java.io.*;


public class IOclass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(isr);
		
		System.out.println("Enter string1 :");
		String s1 = bf.readLine();
		System.out.println("Enter string2 :");
		String s2 = bf.readLine();
		
		System.out.println(s1+" " + s2);
		
	}

}
