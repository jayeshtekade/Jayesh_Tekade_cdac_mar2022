import java.util.Scanner;
class table_7
{ 
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number:");
		int num = sc.nextInt();
		
		for ( int i=0; i<10;i++)
		{
			System.out.println(num + " * "+ (i+1) + " = " + (num * (i+1)));
		}
	}
}