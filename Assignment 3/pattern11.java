class pattern11
{
	public static void main(String args[])
	{
		int n = 9;
		
		for(int i=1; i<=n; i=i+2)
		{
			for(int j= n-1; j>=i; j--)
			{
				System.out.print(" ");
			}
				for(int k=1; k<=i; k++)
				{
					System.out.print("*"+" ");
			    }
		System.out.println();
		}
		
	}
}