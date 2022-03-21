import java.util.Scanner;
class rectangle_13
{
	public static void main(String args[])
	{
		//double w,h, area, perimeter;
		//w=5.6;
		//h=8.5;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter Width");
		double w=sc.nextDouble();
		
		System.out.println("enter Height");
		double h=sc.nextDouble();
		
		double area = (w * h);
		double perimeter = (2*(w + h));
		
		//System.out.println("Area is: " +area);
		
		System.out.println("Area is: "+w+" * " +h+ "="+area);
		System.out.println("Perimeter is: " +perimeter);
	}
}
		
		