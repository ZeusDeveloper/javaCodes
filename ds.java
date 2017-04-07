interface ds
{
	void ins(int x);
	int del();
}
class stack implements ds
{
	int a[],top;
	stack(int size)
	{
		a=new int[size];
		top=-1;
	}
	@Override
	public void ins(int x)
	{
		if(top==a.length-1)
		{
			System.out.println("Stack Overflow !");
			return;
		}
		a[++top]=x;
	}
	@Override
	public int del()
	{
		if(top==-1)
		{
			System.out.println("Stack Underflow !");
			return -99;
		}
		return a[top--];
	}
}
class queue implements ds
{
	int a[],front,rear,n;
	queue(int size)
	{
		a=new int[size];
		front=rear=-1;
	}
	@Override
	public void ins(int x)
	{
		if(n==a.length)
		{
			System.out.println("Queue full !");
			return;
		}
		rear=(rear+1)%a.length;
		a[rear]=x;
		n++;
	}
	@Override
	public int del()
	{
		if(n==0)
		{
			System.out.println("Queue empty!");
			return -99;
		}
		front=(front+1)%a.length;
		n--;
		return a[front];
	}
}
class Main
{
	public static void main(String []args)
	{
		int n;
		stack st=new stack(5);
		queue q=new queue(10);
		for(int i=10;i<=60;i+=10)
		{
			st.ins(i);

			System.out.println("Item to push - "+i);
		}
		do
		{
			System.out.println("Item popped - "+(n=st.del()));
		}
		while(n!=-99);
		for(int i=0;i<=100;i+=10)
		{
			q.ins(i);
			System.out.println("Item to insert - "+i);
		}
		do
		{
			System.out.println("Item deleted - "+(n=q.del()));
		}
		while(n!=-99);
	}
}



	


