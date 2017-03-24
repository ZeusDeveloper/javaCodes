abstract class airline
{
	int pass_id;
	double weight;
	airline(int pass_id,double weight)
	{
		this.pass_id=pass_id;
		this.weight=weight;
	}
	abstract void calculate();
}

class indigo extends airline
{
	int age;
	indigo(int pass_id,double weight,int age)
	{
		super(pass_id,weight);
		this.age=age;
	}
	@Override
	void calculate()
	{
		if(age<60 && weight>20)
			System.out.println("Luggage limit exceeded.\nMax luggage limit - 20kg.");
		else if(age>60 && weight>25)
			System.out.println("Luggage limit exceeded.\nMax luggage limit - 25kg.");
		else
			System.out.println("Your luggage will be safe with us.\nThank you for choosing Indigo airlines.");
	}
}

class spicejet extends airline
{
	String cls;
	spicejet(int pass_id,double weight,String cls)
	{
		super(pass_id,weight);
		this.cls=cls;
	}
	@Override
	void calculate()
	{
		if(cls=="Business" && weight>22)
			System.out.println("Luggage limit exceeded.\nMax lugagge limit - 22kg.");
		else if(cls=="Economy" && weight>19)
			System.out.println("Luggage limit exceeded.\nMax luggage limit - 19kg.");
		else
			System.out.println("Your luggage will be safe with us.\nThank you for choosing Spicejet airlines.");
	}
}

class vistara extends airline
{
	double price;
	vistara(int pass_id,double weight,double price)
	{
		super(pass_id,weight);
		this.price=price;
	}
	@Override
	void calculate()
	{
		if(weight>price*0.001)
			System.out.println("Luggage limit exceeded.\nMax luggage limit - "+price*0.001+"kg.");
		else
			System.out.println("Your luggage will be safe with us.\nThank you for choosing Vistara airlines.");
	}
}

class airdemo
{
	public static void main(String args[])
	{
		System.out.println("----INDIGO----");
		indigo ind=new indigo(7421783,21,18);
		ind.calculate();
		ind.age=61;
		ind.calculate();
		
		System.out.println("----SPICEJET----");
		spicejet spj=new spicejet(3462323,21,"Economy");
		spj.calculate();
		spj.cls="Business";
		spj.calculate();

		System.out.println("----VISTARA----");
		vistara vis=new vistara(7623273,51,50000);
		vis.calculate();
		vis.weight--;
		vis.calculate();
	}
}


		
