class shape
{
	 double l,b,h,area;
	 shape(double l)
	 {
		 this.l=l;
	 }
	 shape(double l,double h)
	 {
		 this.l=l;
		 this.h=h;
	 }
	 shape(double l,double b,double h)
	 {
		 this.l=l;
		 this.h=h;
		 this.b=b;
	 }
	 void calculate()
	 {
		 if(b==0)
		 {
			 if(h==0)
				 area=l*l;
			 area=0.5*l*h;
		 }
		 else
			 area=0.5*(l+b)*h;
	 }
	 void printData()
	 {
		 System.out.println("Area - "+area);
	 }
}
class area
{
	public static void main(String args[])
	{
		shape triangle = new shape(4,9);
		shape trapezium = new shape(4,8,6);
		System.out.println("Triangle");
		triangle.calculate();
		triangle.printData();
		System.out.println("Trapezium");
		trapezium.calculate();
		trapezium.printData();
	}
}



				

