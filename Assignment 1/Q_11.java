import java.util.*;
class Q_11
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first no = ");
		int a=sc.nextInt();
		
		System.out.println("Enter first no = ");
		int b=sc.nextInt();
		
		System.out.println("Enter first no = ");
		int c=sc.nextInt();
		
		if( a<=b && a<=c)
		{
			System.out.println("First number is Smallest");
		}
		else if (b<=a && b<=c)
		{
				System.out.println("Second number is Smallest");
		}
		else
		{
				System.out.println("Third number is Smallest");
		}
	}
}