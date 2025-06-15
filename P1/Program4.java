package p1;
class Program4 implements MyInterface
{
	public void display()
	{
	 System.out.println("Implementation of abstract method ");
	}
	
	public static void main(String args[])
	{	
		Protection obj1 = new Protection();
		Derived obj2 = new Derived();
		SamePackage obj3 = new SamePackage();
		MyInterface obj4 = new Program4();
		obj4.display();
		obj4.show();	
	}
}