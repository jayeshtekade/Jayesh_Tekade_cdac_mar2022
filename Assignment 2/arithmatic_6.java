import java.util.Scanner;
class arithmatic_6
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int sum,sub,mul,div;
		
		System.out.println("enter first number:");
		int n1 = sc.nextInt();
		
		System.out.println("enter second number:");
		int n2 = sc.nextInt();
		
		sum=n1+n2;
		sub=n1-n2;
		mul=n1*n2;
		div=n1/n2;
		
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);
	}
}