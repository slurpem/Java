interface NumericFunc
{
	int func(int n);
}

interface DigitFunc
{
	String check(int n);
}

class Program12
{
	public static void main(String args[])
	{
		NumericFunc factorial = (n) -> {
			int res = 1;
			for(int i=2;i<=n;i++)
			{
				res *= i;
			}
			return res;
		};
		
		DigitFunc oddeven = (n) -> n % 2 == 0 ? "Even":"Odd";
		 
        	System.out.println("Factorial of 5: " + factorial.func(5));
        	System.out.println("5 is " + oddeven.check(5));
        	System.out.println("6 is " + oddeven.check(6));	
	}	
}