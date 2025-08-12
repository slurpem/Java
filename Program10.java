import java.util.*;
class Program10
{
	public static void main(String args[])
	{
		ArrayList<String> al = new ArrayList<String>();
		System.out.println("Size: "+al.size());
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		
		System.out.println(al);
		al.remove(1);

		String sa[] = new String[al.size()];
		sa = al.toArray(sa);
		
		for(String i:sa)
		{
			System.out.println(i);
		}		
	}
}