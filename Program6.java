class Program6
{
	public static void main(String args[])
	{
		try
		{
	 		int a = args.length;
			int b = 42/a;
			int c[] = {1};
			c[18] = 1;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}	
	System.out.println("Out of try catch block");
	}
}
