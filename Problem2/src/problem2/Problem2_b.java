package problem2;

public class Problem2_b {
public static void main(String args[])
{
	try {
	int n= Integer.parseInt(args[0]);
	int count=0;
	for(int i=2;i<=n;i++)
	{
		if(n%i==0)
		{
			count++;
		}
	}
	if(count==1)
	{
		System.out.println(n+" is prime numbere");
	}
	else if(count==0)
	{
		System.out.println(n+" is neither prime nor composite");
	}
	else
		System.out.println(n+" is composite number");
	}
	catch(Exception e)
	{
		System.out.println("Please Enter a integer number");
	}
}
}
