import java.util.*;
class Q_19
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number =");
		int n =sc.nextInt();
		System.out.print("even numbers = ");
		//while(n%2==0)
		for(int i=1;i<=n;i++)
		{
			++i;
			System.out.print(i+ " ");
		}
			
		
	}
}