class Box
{
	double length,width,breadth;
	Box()
	{
	}
	Box(double l, double w, double b)
	{
		length=l;
		width=w;
		breadth=b;
	}
	void printData()
	{
		System.out.println("Volume = "+length*width*breadth);
	}
}
class WeightBox extends Box
{
	double weight;
	WeightBox()
	{
	}
	WeightBox(double l,double w,double b,double wt)
	{
		super(l,w,b);
		weight=wt;
	}
	@Override
	void printData()
	{
		super.printData();
		System.out.println("Weight = "+weight);
	}
}
class colcode extends WeightBox
{
	int code;
	colcode()
	{
	}
	colcode(double l,double w,double b,double wb,int col)
	{
		super(l,w,b,wb);
		code=col;
	}
	@Override
	void printData()
	{
		super.printData();
		System.out.println("Color code = #"+code);
	}
}
class demoBox
{
	public static void main(String args[])
	{
		Box b1;
		b1=new Box(10,20,30);
		b1.printData();
		b1=new WeightBox(10,20,30,300);
		b1.printData();
		b1=new colcode(10,20,30,300,456567);
		b1.printData();
	}
}
