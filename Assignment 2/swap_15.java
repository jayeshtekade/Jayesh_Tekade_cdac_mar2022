import java.util.Scanner;
class swap_15
{
	public static void main(String args[])
	{
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter first number :");
		int a=sc.nextInt();
		
		System.out.println("enter second number :");
		int b=sc.nextInt();
		
		System.out.println("Before swap");
		System.out.println(" a is : " +a);
		System.out.println(" b is : " +b);
		
		int temp=a;
		a=b;
		b=temp;
		
		System.out.println("After swap");
		System.out.println(" a is : " +a);
		System.out.println(" b is : " +b);
	}
}