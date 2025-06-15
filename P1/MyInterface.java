package p1;
public interface MyInterface
{
	void display();
	default void show()
	{
		System.out.println("Default method in MyInterface");
	}
}