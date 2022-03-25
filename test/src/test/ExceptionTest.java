package test;

public class ExceptionTest {
public static void main (String[] args)
{
	try
	{
		System.out.println("try block1");
		System.out.println("try block2");
		System.out.println(10/0);
		System.out.println("try block3");
	}
	catch(ArithmeticException e)
	{
		System.out.println("catch block1");
	}
	finally
	{
		System.out.println("finally block1");
	}
	System.out.println("due to");
}

}
