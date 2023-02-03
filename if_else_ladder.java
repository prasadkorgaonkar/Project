package if_else;

public class if_else_ladder 
{
	public static void main(String args[])
	{
		int a= 50;
		int b= 50;
		if (a>b)
		{
			System.out.print(a+" is greater than "+b);
		}
		else if (b>a)
		{
			System.out.print(b+" is greater than "+a);
		}
		else
		{
			System.out.print("both are equal");
		}
	}

}
