import java.util.Scanner;
class Q_5
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number =");
		int n=sc.nextInt();
		
		if (n<0)
		{
			System.out.println("Negative number");
		}
		else if (n>0)
		{
			System.out.println("Positive Number");
		}
		else
		{
			System.out.println("Neither positive nor negative");
		}
	}
}