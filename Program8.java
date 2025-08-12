enum Apple{
	Golden(100),Red(200),Green(300),Blue(400);
	
	private int price;
	
	Apple(int p)
	{
		price = p;
	}

	int getPrice()
	{
		return price;
	}
}

class Program8
{
	public static void main(String args[])
	{
		System.out.println("the apples are: ");
		for(Apple a: Apple.values())
		{
			System.out.println(a+" = "+ a.getPrice());
		}
		System.out.println(Apple.valueOf("Golden").getPrice());

		Integer iob = 100;
		int i = iob;
	}
}