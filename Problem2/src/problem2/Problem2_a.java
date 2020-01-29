package problem2;

public class Problem2_a {
public static void main(String args[])
{
	try {
	int n = Integer.parseInt(args[0]);
	if(n>0)
	{
		System.out.println(n+" is positive number");
	}
	else if(n<0)
	{
		System.out.println(n+" is negative number");
	}
	else {
		System.out.println(n+" is neither positive nor negative");
	}
	}
	catch(Exception e)
	{
		System.out.println("Should Enter a number");
	}
	
}
}
