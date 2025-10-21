package a;

public class Example {
	public void display()
	{
		System.out.println("This is Display method from Example class of package a");
	}
	
	/*
	public void checkPrime(int n) 
	{
		//It must be divisible by itself only
		int d=2;					
		
		while(d<=n/2)		 	
		{
			if(n%d==0)		
			{
				System.out.println("Not Prime");
				System.out.println("It is divisible by"+d);
				
				break;
			}
			d++;				
		}
		if(d>n/2)
		{
			System.out.println("Prime");
		}
		
	}
	*/
	
	public void checkPrime(int n)
	{
		int d;
		for(d=2;d<=n/2;d++)
		{
			if(n%d==0)
			{
				System.out.println("Not Prime");
				System.out.println("Divisible by "+d);
				break;
			}
		}
		if(d>n/2)
		{
			System.out.println("Prime");
		}
	}
}
