import java.util.*;
class Q_12
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first no = ");
		int a=sc.nextInt();
		
		System.out.println("enter second no = ");
		int b=sc.nextInt();
		
		for(int i=b;i>0;i--)
		{
		a++;
		//b--;
		}
		
		System.out.println("sum of a and b = "+a);
	}
}