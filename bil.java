class bill
{
	int cid;
	double units,amount;
	bill(int cid, double units)
	{
		this.cid=cid;
		this.units=units;
	}
	void calculate()
	{
		if(units<=60)
		{
			amount=units*2.5;
		}
		else if(units<=150)
		{
			amount=(units-60)*4.8 + 60*2.5;
		}
		else if(units<=300)
		{
			amount=(units-150)*6.5+60*2.5+90*4.8;
		}
		else
			amount=60*2.5+90*4.8+150*6.5+(units-300)*7.5;
	}
	void printData()
	{
		System.out.println("Employee CID - "+cid);
		System.out.println("Total bill - "+amount);
	}
}
class demo
{
	public static void main(String args[])
	{
		bill obj=new bill(1331,350);
		obj.calculate();
		obj.printData();
	}
}


