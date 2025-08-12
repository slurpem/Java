import java.util.*;
class Program11
{
	public static void main(String args[])
	{
		LinkedList<String> ll = new LinkedList<String>();
		System.out.println("Size: "+ll.size());
		
		ll.add("A");
		ll.add("B");
		ll.add("C");
		ll.add("D");
		ll.add("E");
		
		System.out.println("Size: "+ll.size());
		System.out.println(ll);

		ll.removeFirst();
		ll.removeLast();
		
		String sa[] = new String[ll.size()];
		sa = ll.toArray(sa);
	
		for(String i: sa)
		{
			System.out.println(i);
		}	
	}
}