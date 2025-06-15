// Multi Level Inheritance
class Box
{
	double height, width, depth;

	Box(Box ob)
	{
		width = ob.width;
		height = ob.height;
		depth = ob.depth;
	}

	Box(double w,double h,double d)
	{
		width = w;
		height = h;
		depth = d;
	}

	Box()
	{
		width = -1;
		height = -1;
		depth = -1;
	}

	Box(double len)
	{
		width = height = depth = len;
	}

	double volume()
	{
		return width * height * depth;
	}
}

class BoxWeight extends Box
{
	double weight;

	BoxWeight(BoxWeight ob)
	{
		super(ob);
		weight = ob.weight;
	}

	BoxWeight(double w, double h, double d, double we)
	{
		super(w,h,d);
		weight = we;
	}

	BoxWeight()
	{
		super();
		weight = -1;
	}

	BoxWeight(double len, double we)
	{
		super(len);
		weight = we;
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

	BoxShipment(double w, double h, double d, double we, double c)
	{
		super(w,h,d,we);
		cost = c;
	}

	BoxShipment()
	{
		super();
		cost = -1;
	}

	BoxShipment(double len, double we, double c)
	{
		super(len,we);
		cost = c;
	}

}

class DemoShipment
{
	public static void main(String args[])
	{
		System.out.println();

		BoxShipment BS1 = new BoxShipment(10,20,15,10,3.41);
		double vol1 = BS1.volume();
		System.out.println("Volume :" + vol1);
		System.out.println("Weight :" + BS1.weight);
		System.out.println("Cost :" + BS1.cost);

		System.out.println();

		BoxShipment BS2 = new BoxShipment(2,3,4,0.76,1.28);
		double vol2 = BS2.volume();
		System.out.println("Volume :" + vol2);
		System.out.println("Weight :" + BS2.weight);
		System.out.println("Cost :" + BS2.cost);

		System.out.println();
	}

}