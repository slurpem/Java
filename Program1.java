class Box
{
	double height,width,depth;
	Box(double depth,double width,double height) //Constructor with this keyword
	{
		this.height=height;
		this.width=width;
		this.depth=depth;
	}
	
	double vol()			//Method Implementation
	{
		return height*width*depth;
	}
}

class Program1
{
	public static void main(String args[])
	{
	Box obj1 = new Box(10,20,30);	//Object Creation
	System.out.println("Volume is computed in Box class = "+obj1.vol());
	
	double volume = obj1.height*obj1.width*obj1.depth;        // Volume in Main class
	System.out.println("Volume is computed in Main class = "+volume);
	}
}