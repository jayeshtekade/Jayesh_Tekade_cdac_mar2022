import java.util.*;
class Q_6
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Year : ");
		int i=sc.nextInt();
		
		if(((i%4==0) || (i%400==0)) && (i%100!=0))
			System.out.println("leap year");
		else
			System.out.println("not a leap year");
	}
}