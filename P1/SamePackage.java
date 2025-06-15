package p1;
class SamePackage
{
	Protection p = new Protection();
	SamePackage()
	{
		System.out.println(p.n);
	   //   System.out.println(p.n_pri);
		System.out.println(p.n_pro);
		System.out.println(p.n_pub);
	}
}