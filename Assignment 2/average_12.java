import java.util.Scanner;
class average_12
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number : ");
		double a = sc.nextDouble();
		
		System.out.println("enter second number : ");
		double b = sc.nextDouble();
		
		System.out.println("enter third number : ");
		double c = sc.nextDouble();
		
		double avg = (( a+b+c )/3);
		
		System.out.println("average is :"+avg);
	}
}