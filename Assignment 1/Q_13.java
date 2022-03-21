import java.util.*;
class Q_13
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		int b;
		int d=0;
		while(a>0)
		{
			b=a%10;
			a=a/10;
			d=((d*10)+b);
		}
		System.out.println("reverse number =" +d);
	}
}