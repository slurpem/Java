class Program5
{
	static void throwOne() throws IllegalAccessException
	{
		throw new IllegalAccessException("Slurp");
	}
	public static void main(String args[])
	{
		try
		{
			int a = args.length;
			try
			{
				int b = 42/a;
				try
				{
					throwOne();	
				}
				catch(IllegalAccessException e)
				{
					System.out.println(e.getMessage());
				}		
			}
			catch(ArithmeticException e)
			{
				System.out.println(e);
			}
		}
		finally
		{
			System.out.println("End of program");
		}	
	}
}