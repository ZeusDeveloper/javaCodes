abstract class bank
{
	int accno;
	double bal;
	void deposit(double amt)
	{
		bal += amt;
		System.out.println("Amount debited - "+ amt);
		System.out.println("Current balance - "+bal);

	}
	abstract void withdrawal(double amt);
}
class savings extends bank
{
	double rate;
	savings(int ac,double bal,double rate)
	{
		accno=ac;
		deposit(bal);
	}
	@Override
	void withdrawal(double amt)
	{
		if((bal-amt)>=10000)
		{	
			bal -= amt;
			System.out.println("Amount credited - "+ amt);
			System.out.println("Current balance - "+bal);
		}
		else
			System.out.println("Limit exceeded !");

	}
	void intCalc()
	{
		bal += bal*rate*0.01;
	}
}
class current extends bank
{
	double fine;
	current(int ac,double bal, double fine)
	{
		accno = ac;
		deposit(bal);
		this.fine = fine;
	}
	@Override
	void withdrawal(double amt)
	{
		bal -= amt;
		if( bal <= -20000)
			bal += fine*0.01*(bal+20000);
		System.out.println("Amount credited - "+ amt);
		System.out.println("Current balance - "+bal);

	}
}
class Main
{
	public static void main(String args[])
	{
		System.out.println("---SAVINGS ACCOUNT---");
		savings sc = new savings(1453232,15000,5);
		sc.intCalc();
		sc.withdrawal(1200);
		System.out.println("---CURRENT ACCOUNT---");
		current curr = new current(1453223,10000,5);
		curr.withdrawal(35000);
	}
}
		


