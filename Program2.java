// Multi Level Inheritance
abstract class Box
{
	double height, width, depth;

	Box(Box ob)
	{
		width = ob.width;
		height = ob.height;
		depth = ob.depth;
	}

	Box()
	{
		width = -1;
		height = -1;
		depth = -1;
	}

	abstract double volume();
}

class BoxWeight extends Box
{
	double weight;

	double volume()
	{
		return height*width*depth;
	}

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
		cost = -1;
	}
}

class Program2
{
	public static void main(String args[])
	{
		System.out.println();

		BoxShipment BS1 = new BoxShipment();
		double vol1 = BS1.volume();
		System.out.println("Volume :" + vol1);
		System.out.println("Weight :" + BS1.weight);
		System.out.println("Cost :" + BS1.cost);
	}

}
