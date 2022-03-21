import java.util.Scanner;
class Q_1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no : ");
		int i=sc.nextInt();
		
		if(i%2==0)
			System.out.println("Even number");
		else
			System.out.println("Odd number");
	}
}
		