import java.util.*;
class Q_17
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number = ");
		int a=sc.nextInt();
		int temp=a;
		int rem;
		int sum=0;
		while(a>0)
		{
			rem=a%10;
			a=a/10;
			sum=(sum*10)+rem;
		}
			if (temp==sum)
				System.out.println("palindrome number");
			else
				System.out.println("not a palindrome number");
		
	}
}
			