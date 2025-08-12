import java.util.Scanner;

class Box
{
	double h,w,d;
	Box(double h,double w,double d)
	{
		this.h = h;
		this.w = w;
		this.d = d;
	}
	
	public String toString()
	{
		return "the dimension are" +h+" by "+w+" by "+d;
	}
}

class Program3
{
	public static void main(String args[])
	{
		Box b = new Box(10,20,30);
		String s = "Converted "+b;
		System.out.println(b);
		System.out.println(s);

		String s2 = "Just Do it, NIKE!!!";
		int start = 5;
		int end = 12;
		char buf[] = new char[end-start];
		s2.getChars(start,end,buf,0);
		System.out.println(buf);

		System.out.println("The number of arguements are: "+args.length);
		for(int i=0;i<args.length;i++)
		{
			System.out.println(args[i]);
		}	

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = sc.nextLine();
		System.out.println("Hello, "+name);
		sc.close();
	}
}