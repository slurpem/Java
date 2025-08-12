class Box
{
	double height, width, depth;

	Box(double h, double w, double d)
	{
		height = h;
		width = w;
		depth = d;
	}

	double volume()
	{
		return height*width*depth;
	}
}

class Program1
{
	public static void main(String args[])
	{
		Box ob1 = new Box(10,5,10);
		System.out.println(ob1.volume());
	}
}