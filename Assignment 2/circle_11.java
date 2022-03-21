import java.util.Scanner;
class circle_11
{
	public static void main(String args[])
	{
		
		//double area,perimeter,r;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter radius");
		double r=sc.nextDouble();
		
		double area = ((22.0/7)*r*r);
		double perimeter= (2*(22.0/7)* r);
		
		System.out.println("Area is: " +area);
		System.out.println("Perimeter is: " +perimeter);
	}
}
		
		