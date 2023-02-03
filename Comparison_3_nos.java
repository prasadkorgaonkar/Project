package if_else;

class Simple
{
	public static void main(String args[])
		{
			int a=80;
			int b=60;
			int c=60;
			if (a>b && a>c)
				{
					System.out.print(a+" is greater than "+b+" & "+c);
				}
			else if (b>c && b>a)
				{
					System.out.print(b+" is greater than "+a+" & "+c);
				}
			else if(c>a && c>b)
				{
					System.out.print(c+ " is greater than "+a+" & "+b);
				}
		}
}	
		
		
		
 