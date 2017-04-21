import java.io.*;
class MyException extends Exception
{
	int detail;
	MyException(int x)
	{
		detail=x;
	}
	public String toString()
	{
		return "MyException"+"["+detail+"]";
	}
}
class A
{
	static void compute(int a)throws MyException
	{
		System.out.println("Inside compute with "+a);
		if(a>10)
			throw new MyException(a);
		System.out.println("Normal Exit");
	}
}
class Demo
{
	public static void main(String []args)throws IOException
	{
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			String s1=br.readLine();
			String s2=br.readLine();
			int a=Integer.parseInt(s1);
			int b=Integer.parseInt(s2);
			A.compute(a);
			A.compute(b);
		}
		catch(MyException e)
		{
			System.out.println(e);
		}
	}
}

