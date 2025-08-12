abstract class Box1
{
	double height,width,depth;

	Box1(Box1 ob)
	{
		height = ob.height;
		width = ob.width;
		depth = ob.depth;
	}

	Box1()
	{
		height = -1;
		width = -1;
		depth = -1;
	}

	Box1(double h,double w,double d)
	{
		height = h;
		width = w;
		depth = d;
	}

	abstract double volume();
}

class BoxWeight extends Box1
{
	double volume()
	{
		return height*width*depth;
	}

	double weight;

	BoxWeight(BoxWeight ob)
	{
		super(ob);
		weight = ob.weight;
	}
	BoxWeight()
	{
		super();
		weight = -1;
	}

	BoxWeight(double h,double w,double d,double wei)
	{
		super(h,w,d);
		weight = w;
	}
}

class BoxShipment extends BoxWeight
{
	double cost;

	BoxShipment(BoxShipment ob)
	{
			super(ob);
			cost = ob.cost;
	}

	BoxShipment()
	{
		super();
		cost = -10;
	}

	BoxShipment(double h,double w,double d,double wei,double c)
	{
			super(h,w,d,wei);
			cost = c;
	}
}

class Program2
{
	public static void main(String args[])
	{
		 BoxShipment ob1 = new BoxShipment(10,20,30,40,50);
		 double vol = ob1.volume();
		
		System.out.println("Direct call");
		System.out.println(vol);
		System.out.println(ob1.cost);
		System.out.println(ob1.weight);
			
		System.out.println("Dynamic Dispatch");
		Box1 ref;
		ref = ob1;
		System.out.println(ref.volume());
	}
}