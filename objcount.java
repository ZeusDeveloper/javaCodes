class object
{
	static int count;
	object()
	{
		count++;
	}
	void printCount()
	{
		System.out.println("Number of objects - " + count);
	}
}
class objcount
{
	public static void main(String []args)
	{
		object obj1=new object();
		obj1.printCount();
		object obj2=new object();
		obj2.printCount();
		object obj3=new object();
		obj3.printCount();
		object obj4=new object();
		obj4.printCount();
	}
}

