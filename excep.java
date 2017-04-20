class excep
{
	public static void main(String args[])
	{
		try
		{
			int a=args.length;
			System.out.println("Length - "+a);
			int b=42/a;
			try
			{
				if(a==1)
				{
					int c=a/(a-a);
					System.out.println("c = "+c);
				}
				if(a==2)
				{
					int d[]={10,20,30};
					d[10]=80;
				}
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e);
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
	}
}
