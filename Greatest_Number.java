package if_else;

public class Greatest_Number 
{
	public static void main(String args[])
	{
		int a= 20;
		int b= 80;
		int c= 20;
		if (a==b & b==c & a==c)
		{
			System.out.print("All are equal numbers");
		}
		else if (a>b & a>c)
		{
			System.out.print(a+" is greater number");
		}
		else if (b>c)
		{
			System.out.print(b+" is greater number");
		}
		else 
		{
			System.out.print(c+" is greater number");
		}
	}

}
