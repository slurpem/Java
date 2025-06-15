class Box
{
	double h,w,d;
	Box(double h,double w,double d)
	{
		this.h=h;
		this.w=w;
		this.d=d;
	}
	
	public String toString()
	{
		return "The dimension are "+h+" by "+w+" by "+d+". ";
	}
}

class Program3
{
	public static void main(String args[])
	{
		Box b = new Box(10,12,15);
		String s = "The box is converted."+b;
		System.out.println(b);
		System.out.println(s);
		
		String s2 = "Nike! Just Do It!!!";
		int start = 6;
		int end = 13;
		char buf[]= new char[end-start];
		s2.getChars(start,end,buf,0);
		System.out.println(buf);
		
		System.out.println("The number of arguments = "+args.length);
		for(int i=0;i<args.length;i++)
		{
			System.out.println("The arguments are "+args[i]);
		}
	}
}