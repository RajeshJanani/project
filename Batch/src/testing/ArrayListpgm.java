package testing;

import java.util.*;

public class ArrayListpgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ArrayList<Integer> ar = new ArrayList<>();
	
	ar.add(1);
	ar.add(2);
	ar.add(3);
	ar.add(1);
	
	Iterator<Integer> itr = ar.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		int rem = ar.remove(1);
		System.out.println(rem);
		int count = ar.size();
		
		System.out.println(count);
		
		System.out.println(ar.get(0));
	}
	
	

}
