import java.util.Scanner;
class freq
{
	public static void main(String []args)
	{
		int v=0,cn=0,f=0;
		String str;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the string - ");
		str = sc.next();
		for(char c='a';c<='z';c++)
		{
			for(int i=0;i<str.length();i++)
			{
				if(str.substring(i,i+1).equalsIgnoreCase(Character.toString(c)))
				{
					f++;
					if(str.substring(i,i+1).matches("(A|E|I|O|U|a|e|i|o|u)"))
					{
						v++;
					}
					else
					{
						cn++;
					}
				}
			}
			if(f!=0)
			{
				System.out.println("Number of "+c+" or " +Character.toUpperCase(c)+" - "+f);
				f=0;
			}
		}
		System.out.println("Number of vowels - "+v);
		System.out.println("Number of consonents - "+cn);
	}
}
