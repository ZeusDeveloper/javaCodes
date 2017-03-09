class complex
{
	int rl,im;
	complex(int rl,int im)
	{
		this.rl=rl;
		this.im=im;
	}
	complex mul(complex c)
	{
		complex t=new complex(0,0);
		t.rl=rl*c.rl-im*c.im;
		t.im=rl*im+c.rl*c.im;
		return t;
	}
	void printData()
	{
		System.out.println(rl+" + i"+im);
	}
}
class cmul
{
	public static void main(String args[])
	{
		complex c1=new complex(2,3);
		complex c2=new complex(4,5);
		c1.mul(c2).printData();
	}
}
