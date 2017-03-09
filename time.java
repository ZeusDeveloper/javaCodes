class diff
{
	int hr,mn;
	diff(int h,int m)
	{
		hr=h;
		mn=m;
	}
	diff sum(diff t)
	{
		diff res=new diff(0,0);
		res.hr=hr+t.hr+(mn+t.mn)/60;
		res.mn=(mn+t.mn)%60;
		return res;
	}
	void printData()
	{
		System.out.println(hr+" : "+mn);
	}
}
class time
{
	public static void main(String args[])
	{
		diff t1=new diff(1,45);
		diff t2=new diff(2,45);
		diff t3=t1.sum(t2);
		t3.printData();
	}
}

