class A
{
	void callMe()
	{
		System.out.println("Inside class A");
	}
}
class B extends A
{
	void callMe()
	{
		System.out.println("Inside class B");
	}
}
class C extends A
{
	void callMe()
	{
		System.out.println("Inside class C");
	}
}
class demo
{
	public static void main(String args[])
	{
		A obA=new A();
		B obB=new B();
		C obC=new C();
		A r;
		r=obA;
		r.callMe();
		r=obB;
		r.callMe();
		r=obC;
		r.callMe();
	}
}
