class TwoGen<T,V>
{
	T ob1;
	V ob2;

	TwoGen(T o1,V o2)
	{
		ob1 = o1;
		ob2 = o2;
	}
		
	T getOb1()
	{
		return ob1;
	}
	
	V getOb2()
	{
		return ob2;
	}

	void showType()
	{
		System.out.println("The type of T and V "+ob1.getClass().getName()+ob2.getClass().getName());
	}
}

class Program9
{
	public static void main(String args[])
	{
		TwoGen<Integer,String> tg = new TwoGen<Integer,String>(7,"Ronaldo");
		int a = tg.getOb1();
		String b = tg.getOb2();
		System.out.println(a+" and "+b);
		tg.showType();
	}
}