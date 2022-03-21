import java.util.Scanner;
class Q_4
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first no = ");
		int a=sc.nextInt();
		
		System.out.println("Enter second no = ");
		int b=sc.nextInt();
		System.out.println("number before swap = "+a+" "+b);
		
		a= a+b;
		b= a-b;
		a= a-b;
		System.out.println("number After swap = "+a+" "+b);
	}
}
		
		