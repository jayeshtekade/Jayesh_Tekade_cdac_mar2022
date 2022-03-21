import java.util.Scanner;
class sum_2
{
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter first number:");
		int a = sc.nextInt();
		
		System.out.println("enter second number:");
		int b = sc.nextInt();
		
		int sum=a+b;
		//System.out.println(sum);
		System.out.println("sum of a and b "+sum);
		//System.out.println("sum of "+a+" and "+b+ " is " +sum); 
	}
}
	